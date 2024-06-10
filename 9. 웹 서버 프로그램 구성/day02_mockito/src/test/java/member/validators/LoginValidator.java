package member.validators;

import global.exceptions.ValidationException;
import global.validators.Validator;
import jakarta.servlet.http.HttpServletRequest;

public class LoginValidator implements Validator<HttpServletRequest>, RequiredValidator {
    // 통일된 규격으로 정의

    @Override
    public void check(HttpServletRequest form) {
        // join 서비스에서 얘를 사용
        String email = form.getParameter("email");
        String password = form.getParameter("password");

        /* 필수 항목 검증 B */
        checkRequired(email, new ValidationException("이메일을 입력하세요."));
        checkRequired(password, new ValidationException("비밀번호을 입력하세요."));

    }


}
