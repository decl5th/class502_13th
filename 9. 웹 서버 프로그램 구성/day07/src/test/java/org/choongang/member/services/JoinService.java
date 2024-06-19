package org.choongang.member.services;

import org.choongang.global.exceptions.BadRequestException;
import org.choongang.global.validators.Validator;
import org.choongang.member.controllers.RequestJoin;

// 회원가입 기능
public class JoinService {

    // 의존성 역전원칙로 검증 예
    private Validator<RequestJoin> validator;

    // 생성자를 넣어서 개방폐쇄의 원칙을 적용
    public JoinService(Validator<RequestJoin> validator) {
        this.validator = validator;
    }

    public void process(RequestJoin form) {
       // 유효성 검사 담당 검사를 실패했을 땐 예외가 던져진다 예외가 던져지지 않으면 검증 성공!
        validator.check(form);
    }
}
