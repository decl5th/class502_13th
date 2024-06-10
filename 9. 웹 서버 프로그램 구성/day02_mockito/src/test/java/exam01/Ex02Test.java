package exam01;

import com.github.javafaker.Faker;
import global.Mailer;
import jakarta.servlet.http.HttpServletRequest;
import member.services.LoginService;
import member.validators.LoginValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.only;

public class Ex02Test {

    private LoginService loginService;
    private Mailer mailer;
    private Faker faker;
    private HttpServletRequest request;

    @BeforeEach
    void init() {
        loginService = new LoginService(new LoginValidator());
        mailer = mock(Mailer.class);
        faker = new Faker(Locale.ENGLISH);

        loginService.setMailer(mailer);
        request = mock(HttpServletRequest.class); // 가짜 객체 생성

        // Stub 추가
        given(request.getParameter("email")).willReturn(faker.internet().emailAddress());
        given(request.getParameter("password")).willReturn(faker.regexify("\\w{8}").toLowerCase());
    }
    @Test
    void test1() {
        loginService.setMailer(mailer);
        loginService.process(request);
        String email = request.getParameter("email");

        then(mailer).should(only()).send(email);
        // send 함수가 loginService.process 메서드에서 한번 이상 호출 되는지 테스트
        // 로그인이 되면 입력된 이메일로 메일을 보내는 테스트
    }

    @Test
    void test2() {
        // 인자 캡쳐 ArgumentCaptor
        // 메일을 제대로 보냈는지에 대한 확인 절차 혹여나 메일을 다르게 입력하지는 않았는지, 송수신 메일을 바꿔서 입력하지는 않았는지
        loginService.setMailer(mailer);
        loginService.process(request);
        String email = request.getParameter("email"); // 실제로 입력해서 보낸 메일 주소

        // 캡쳐할려는 매개변수의 자료형을 입력
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        then(mailer).should().send(captor.capture());
        String usedEmail = captor.getValue(); // send 메서드에서 매개변수로 사용한 값
        //System.out.println(usedEmail); // 캡쳐한 메일 주소

        assertEquals(email, usedEmail);
    }

}
