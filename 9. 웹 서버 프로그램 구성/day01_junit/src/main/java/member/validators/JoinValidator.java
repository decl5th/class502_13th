package member.validators;

import global.exceptions.ValidationException;
import global.validators.RequiredValidator;
import global.validators.Validator;
import member.controllers.RequestJoin;

public class JoinValidator implements Validator<RequestJoin>, RequiredValidator {
    @Override
    public void check(RequestJoin form) {
        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String userName = form.getUserName();
        boolean termsAgree = form.isTermsAgree();

        /* 필수 항목 검증 B */
        /*
        if (email == null || email.isBlank()) {
            throw new ValidationException("이메일을 입력하세요.");
        }

        if (password == null || password.isBlank()) {
            throw new ValidationException("비밀번호를 입력하세요.");
        }

        if (confirmPassword == null || confirmPassword.isBlank()) {
            throw new ValidationException("비밀번호 확인해야음.");
        }

        if (!password.equals(confirmPassword)) {
            throw new ValidationException("비밀번호 밀번호를 확인해야음.");
        }
        */
        // 반복이 너무 많아 비효율적
        /* 필수 항목 검증 D */

        /* 필수 항목 검증 B */
        checkRequired(email, new ValidationException("이메일을 입력하세요."));
        checkRequired(password, new ValidationException("비밀번호를 입력하세요."));
        checkRequired(confirmPassword, new ValidationException("비밀번호 확인하세요."));
        checkRequired(userName, new ValidationException("회원명을 입력하세요."));
        checkTrue(termsAgree, new ValidationException("약관에 동의하세요."));
        /* 필수 항목 검증 D */
    }
}
