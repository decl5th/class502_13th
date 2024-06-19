package org.choongang.member.mapper;

import org.choongang.member.entities.Member;

public interface MemberMapper {
    // 만든 쿼리에 대한 테스트 진행
    long exist(String email);
    Member get(String email); // 조회
    int register(Member member); // 회원 등록

}
