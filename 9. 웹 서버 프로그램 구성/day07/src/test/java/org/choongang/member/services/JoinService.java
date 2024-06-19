package org.choongang.member.services;


import org.choongang.global.validators.Validator;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.mapper.MemberMapper;

// 회원가입 기능
public class JoinService {

    // 의존성 역전원칙로 검증 예
    private Validator<RequestJoin> validator;

    //DB 쿼리에 대한 의존성 추가
    private MemberMapper mapper; // 구성(composition)을 통한 기능 확장

    public JoinService(Validator<RequestJoin> validator, MemberMapper mapper) {
        this.validator = validator;
        this.mapper = mapper;
    }

    // 생성자를 넣어서 개방폐쇄의 원칙을 적용
    public JoinService(Validator<RequestJoin> validator) {
        this.validator = validator;
    }

    public void process(RequestJoin form) {
       // 유효성 검사 담당 검사를 실패했을 땐 예외가 던져진다 예외가 던져지지 않으면 검증 성공!
        validator.check(form);
    }
}
