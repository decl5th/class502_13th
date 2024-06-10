package member.services;

import global.exceptions.ValidationException;
import global.validators.Validator;
import jakarta.servlet.http.HttpServletRequest;
import member.validators.LoginValidator;

public class LoginService {
    // private LoginValidator valiator = new LoginValidator(); 개방 폐쇄의 원칙을 따라서 다르게 표현

    private Validator<HttpServletRequest> valiator; // 역전 의존 법칙 적용

    public LoginService(Validator<HttpServletRequest> valiator) {
        this.valiator = valiator;

    }

    public void process(HttpServletRequest request) {
        /* 아이디 : email, 비밀번호 password

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // 인터페이스를 추가해서 역할 분담
        if (email == null || email.isBlank()) {
            throw new ValidationException("이메일을 입력하세요.");
        }
         */

        valiator.check(request);
    }
}
