package org.choongang.member.tests;

import com.github.javafaker.Faker;
import org.choongang.global.configs.DBConn;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.entities.Member;
import org.choongang.member.exceptions.DuplicatedMemberException;
import org.choongang.member.mapper.MemberMapper;
import org.choongang.member.services.JoinService;
import org.choongang.member.services.MemberServiceProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("회원가입 기능 테스트")
public class JoinServiceTest {

    private JoinService service;
    private MemberMapper mapper;

    @BeforeEach
    void init() {
        service = MemberServiceProvider.getInstance().joinService(); // 그래서 여기서 객체 생성해주도록 함 더 나가 완성된 객체를 가져오도록 함
        mapper = DBConn.getSession().getMapper(MemberMapper.class);
    }

    //회원데이터 필요할 때마다 조회 , faker을 이용하여 데이터를 생성합니다.
    RequestJoin getData() {
        Faker faker = new Faker(Locale.ENGLISH);

        //이메일은 중복이 되면 안되고, 비번은 8자리 이상
        RequestJoin form = RequestJoin.builder()
                .email(System.currentTimeMillis() + faker.internet().emailAddress())
                .password(faker.regexify("\\w{8}").toLowerCase())
                .userName(faker.name().fullName())
                .termsAgree(true)
                .build();
        form.setConfirmPassword(form.getPassword());

        return form;
    }

    @Test
    @DisplayName("회원가입 성공시 예외가 발생하지 않음")
    void successTest() {
        RequestJoin form = getData();
        assertDoesNotThrow(() -> {
            //JoinService service = new JoinService(); // 매번 테스트마다 객체 생성 번거로움
            service.process(form);
        });

        // 가입된 이메일로 회원이 조회되는지 체크
        Member member = mapper.get(form.getEmail());
        assertEquals(form.getEmail(), member.getEmail());
    }

    @Test
    @DisplayName("필수 입력항목(이메일, 비밀번호, 비번 확인, 회원명, 약관 동의) 검증, 검증 실패시 BadRequestException 발생")
    // 입력 데이터와 예외처리에 대한 내용이 필요
    void requiredFieldTest() {
        assertAll(
                // 이메일 검증
                () -> requiredEachFieldTest("email", true, "이메일"),
                () -> requiredEachFieldTest("email", false, "이메일"),
                // 비번 검증
                () -> requiredEachFieldTest("password", true, "비밀번호"),
                () -> requiredEachFieldTest("password", false, "비밀번호"),
                () -> requiredEachFieldTest("confirmPassword", true, "비밀번호를 확인"),
                () -> requiredEachFieldTest("confirmPassword", false, "비밀번호를 확인"),
                // 회원명 검증
                () -> requiredEachFieldTest("userName", true, "회원명"),
                () -> requiredEachFieldTest("userName", false, "회원명"),
                // 약관 동의 검증
                () -> requiredEachFieldTest("termsAgree", false, "약관")
        );
    }

    // 각각의 필드를 테스트할 수 있는 메서드 정의
    // field 데이터 체크
    // 메세지에 지정한 keyword 값이 포함되어 있는지 까지 체크
    // null값이 들어갔는지에 대해서 체크
    void requiredEachFieldTest(String field, boolean isNull, String keyword) {
        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {
            RequestJoin form = getData();
            if (field.equals("email")) {
                form.setEmail(isNull ? null : "      ");
            } else if (field.equals("password")) {
                form.setPassword(isNull ? null : "      ");
            } else if (field.equals("confirmPassword")) {
                form.setConfirmPassword(isNull ? null : "      ");
            } else if (field.equals("userName")) {
                form.setUserName(isNull ? null : "      ");
            } else if (field.equals("termsAgree")) {
                form.setTermsAgree(false);
            }
            service.process(form);
        }, field + "테스트");

        // 메세지에 키워드가 포함되어 있는지 확인
        String message = thrown.getMessage();
        assertTrue(message.contains(keyword), field + "키워드 테스트");
    }

    @Test
    @DisplayName("비밀번호와 확인이 일치하지 않으면 BadRequestException 발생")
    void passwordMismatchTest() {
        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {
            RequestJoin form = getData();
            form.setConfirmPassword(form.getPassword() + "**");
            service.process(form);
        });
        String message = thrown.getMessage();
        assertTrue(message.contains("비밀번호가 일치하지"));
    }

    @Test
    @DisplayName("이메일이 형식에 맞지 않으면 BadRequestException 발생")
    void emailPatternTest() {
        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {
            RequestJoin form = getData();
            form.setEmail("*******");
            service.process(form);
        });

        String message = thrown.getMessage();
        assertTrue(message.contains("이메일 형식이"));
    }

    @Test
    @DisplayName("비밀번호 자리수가 8자리 미만이면 BadRequestException 발생")
    void passwordLengthTest() {
        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {
           Faker faker = new Faker();
           RequestJoin form = getData();

           form.setPassword(faker.regexify("\\w{3,7}").toLowerCase());
            // 3 자리에서 7자리 문자(대소문자 포함= w)
           form.setConfirmPassword(form.getPassword());
           service.process(form);
        });
        String message = thrown.getMessage();
        assertTrue(message.contains("8자리 이상"));
    }

    @Test
    @DisplayName("이미 가입된 메일인 경우 DuplicateEmailException 발생")
    // 회원 중복에 대한 경우 검증
    void duplicateEmailTest() {
        // 문구는 고정이니까 체크할 필요없고 예외만 체크
        MemberServiceProvider provider = MemberServiceProvider.getInstance();
        assertThrows(DuplicatedMemberException.class, () -> {
            RequestJoin form = getData();
            provider.joinService().process(form);
            // 한번 더 가입시키면 예외 발생
            provider.joinService().process(form);
        });
    }
}
