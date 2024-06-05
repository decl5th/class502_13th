package tests;

import jakarta.servlet.http.HttpServletRequest;
import member.services.LoginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {

    private LoginService loginService;
    private HttpServletRequest request;

    @BeforeEach
    // beforeeach에서 초기화 시켜서 테스트할 때마다 객체 생성 방지
    void init() {
        loginService = new LoginService();
    }
    @Test
    @DisplayName("로그인 성공시 예외가 발생하지 않음")
    void successTest() {
        assertDoesNotThrow(() -> {
            loginService.process(request);
        });
    }
}
