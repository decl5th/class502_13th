package org.choongang.member.services;


import jakarta.servlet.http.HttpServletRequest;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.global.validators.Validator;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.entities.Member;
import org.choongang.member.mapper.MemberMapper;
import org.mindrot.jbcrypt.BCrypt;

import java.util.Objects;

// 회원가입 기능
public class JoinService {

    // 의존성 역전원칙로 검증 예
    private Validator<RequestJoin> validator;

    //DB 쿼리에 대한 의존성 추가
    private MemberMapper mapper; // 구성(composition)을 통한 기능 확장

    // 생성자를 넣어서 개방폐쇄의 원칙을 적용
    public JoinService(Validator<RequestJoin> validator, MemberMapper mapper) {
        this.validator = validator;
        this.mapper = mapper;
    }


    public void process(RequestJoin form) {
       // 유효성 검사 담당 검사를 실패했을 땐 예외가 던져진다 예외가 던져지지 않으면 검증 성공!
        validator.check(form);

        // 비밀번호 해시화 - BCrypt
        String hash = BCrypt.hashpw(form.getPassword(), BCrypt.gensalt(12));

        Member member = new Member();
        member.setEmail(form.getEmail());
        member.setPassword(hash);
        member.setUserName(form.getUserName());
        // 이 값(암호화한 비번 및 회원정보)으로 회원 등록 및 그에 대한 예외 처리
        int result = mapper.register(member);
        if (result < 1) {
            throw new BadRequestException("회원가입에 실패하였습니다.");
        }
    }

    public void process(HttpServletRequest request) {

        // Objects.requireNonNullElse(객체, null일 때 기본값);
        String _termsAgree = Objects.requireNonNullElse(request.getParameter("termsAgree"), "false");
        boolean termsAgree = Boolean.parseBoolean(_termsAgree);

        RequestJoin form = RequestJoin.builder()
                .email(request.getParameter("email"))
                .password(request.getParameter("password"))
                .userName(request.getParameter("userName"))
                .termsAgree(termsAgree)
                .build();

        process(form);
    }
}
