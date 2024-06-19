package org.choongang.member.tests;

import com.github.javafaker.Faker;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.services.JoinService;
import org.choongang.member.services.MemberServiceProvider;
import org.choongang.member.validators.JoinValidator;
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

    @BeforeEach
    void init() {
        service = MemberServiceProvider.getInstance().joinService(); // 그래서 여기서 객체 생성해주도록 함 더 나가 완성된 객체를 가져오도록 함
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
        assertDoesNotThrow(() -> {
            //JoinService service = new JoinService(); // 매번 테스트마다 객체 생성 번거로움
            service.process(getData());
        });
    }

    @Test
    @DisplayName("필수 입력항목(이메일, 비밀번호, 비번 확인, 회원명, 약관 동의) 검증, 검증 실패시 BadRequestException 발생")
    // 입력 데이터와 예외처리에 대한 내용이 필요
    void requiredFieldTest() {
        assertThrows(BadRequestException.class, () -> {
           RequestJoin form = getData();
           form.setEmail(null);
           service.process(form);
        });
    }
}
