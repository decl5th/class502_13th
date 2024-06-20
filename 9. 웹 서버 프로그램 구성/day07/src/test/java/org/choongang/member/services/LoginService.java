package org.choongang.member.services;

import jakarta.servlet.http.HttpServletRequest;
import org.choongang.global.validators.Validator;

public class LoginService {

    private Validator<HttpServletRequest> validator;

    public LoginService(Validator<HttpServletRequest> validator) {
        this.validator = validator;
    }


    // 매개변수로 HttpServletRequest request가 들어감
    public void process(HttpServletRequest request) {
        // 로그인 유효성 검사
        validator.check(request);
    }
}
