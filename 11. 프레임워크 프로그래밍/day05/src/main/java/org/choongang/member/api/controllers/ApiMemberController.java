package org.choongang.member.api.controllers;

import lombok.RequiredArgsConstructor;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/member") // 앞에 api가 붙어있는 주소
public class ApiMemberController {
    // 회원 이메일 조회 후 출력

    private final MemberMapper mapper;

    @GetMapping("/info/{email}")
    public Member info(@PathVariable("email") String email) {
        // Content-Type: application/json
        Member member = mapper.get(email);

        return member;
    }

    @GetMapping("/test")
    public String test() {
        // Content-Type: text/plain
        return "안녕하세요";
    }
}
