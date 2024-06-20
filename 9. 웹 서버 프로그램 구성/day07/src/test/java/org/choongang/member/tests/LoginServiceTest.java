package org.choongang.member.tests;

import com.github.javafaker.Faker;
import jakarta.servlet.http.HttpServletRequest;
import org.choongang.member.services.LoginService;
import org.choongang.member.services.MemberServiceProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("로그인 기능 테스트")
public class LoginServiceTest {

    private LoginService loginService;

    @Mock // 가짜로 객체를 만들어줌
    private HttpServletRequest request;
    private Faker faker;

    @BeforeEach
    void init() {
        loginService = MemberServiceProvider.getInstance().loginService();

        faker = new Faker(Locale.ENGLISH);

        setParam("email", faker.internet().emailAddress());
        setParam("password", faker.regexify("\\w{8}").toLowerCase());
    }

    //가짜 데이터를 만들수 있는 메서드 추가
    void setParam(String name, String value) {
        //stub 생성
        given(request.getParameter(name)).willReturn(value);
    }

    @Test
    @DisplayName("로그인 성공시 예외가 발생하지 않음")
    void successTest() {
        assertDoesNotThrow(() -> {
            // LoginService loginService = new LoginService(); //위에서 객체 가져오기 때문에 객체 생성하는 로직 빼도 됨
            loginService.process();
        });
    }

    @Test
    @DisplayName("필수 입력 항목(이메일, 비밀번호) 검증, 검증 실패시 BadRequestException 발생")
    void requiredFieldTest() {

    }

}
