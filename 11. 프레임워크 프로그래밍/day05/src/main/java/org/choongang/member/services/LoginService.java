package org.choongang.member.services;

import lombok.RequiredArgsConstructor;
import org.choongang.member.controllers.RequestLogin;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberMapper mapper;

    public void process(RequestLogin form) {

        Member member = mapper.get(form.getEmail());
    }
}
