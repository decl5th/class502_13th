package org.choongang.member.validators;

import org.choongang.global.exceptions.BadRequestException;
import org.choongang.global.validators.RequiredValidator;
import org.choongang.global.validators.Validator;
import org.choongang.member.controllers.RequestJoin;


// RequestJoin을 검증하는 joinValidator
// joinService내에서 joinValidator를 사용하겠다
public class JoinValidator implements Validator<RequestJoin>, RequiredValidator {

    @Override
    public void check(RequestJoin form) {
        /* 필수 항목 검증 - 이메일, 비번, 비번확인, 회원명, 약관 동의 */
        // 필수 항목이 필요하면 추가하고 필요없으면 제거 하는 방향으로 잡기 위해 인터페이스 생성

        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String userName = form.getUserName();
        boolean termsAgree = form.isTermsAgree();

        checkRequired(email, new BadRequestException("이메일을 입력하세요."));
        checkRequired(password, new BadRequestException("비밀번호를 입력하세요."));
        checkRequired(confirmPassword, new BadRequestException("비밀번호를 확인하세요."));
        checkRequired(userName, new BadRequestException("회원명를 입력하세요."));
        // checktrue 생성하고나서 추가됨 왜? boolean값이라서
        checkTrue(termsAgree, new BadRequestException("약관에 동의하세요."));
    }
}
