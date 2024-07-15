package org.choongang.member.services;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.choongang.member.controllers.RequestLogin;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberMapper mapper;
    private final HttpSession session; // 세션에 회원 정보 유지하기 위함

    public void process(String email) {
        /**
         * 1. email로 회원조회
         * 2. 세션에 회원 정보를 조회
         */

        Member member = mapper.get(email);
        if (email == null) {
           return;
        }
        session.setAttribute("member", member);
    }
}
