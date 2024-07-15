package org.choongang.member.services;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
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
    private final HttpServletResponse response; // 쿠키를 위한 객체 주입

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

    public void process(RequestLogin form) {
       process(form.getEmail());

       /* 이메일 기억하기 처리 */
        Cookie cookie = new Cookie("savedEmail", form.getEmail());
        if (form.isSaveEmail()){ // 쿠키 등록
            cookie.setMaxAge(60 * 60 * 24 * 7); // 7일간 쿠키 유지

        } else { // 쿠키 제거; 만료 시간을 제거
            cookie.setMaxAge(0);
        }

        response.addCookie(cookie); // 해당 쿠키가 삭제되거나 등록 되도록
    }
}
