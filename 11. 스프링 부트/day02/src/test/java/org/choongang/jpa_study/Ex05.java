package org.choongang.jpa_study;

import org.choongang.member.constants.Authority;
import org.choongang.member.entities.Member;
import org.choongang.member.repositories.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex05 {
    // 레포지토리를 가지고 엔티티 관련 쿼리 테스트 수행
    @Autowired
    private MemberRepository memberRepository;

    @BeforeEach
    void init() {
        for (int i = 1; i < 10; i++) {

        Member member = Member.builder()
                .email("user" + i + "@test.org")
                .password("12345678")
                .userName("사용자" + i)
                .authority(Authority.USER)
                .build();
        memberRepository.save(member); // 영속성 상태로 진입


        //memberRepository.saveAndFlush(member);
        }

        memberRepository.flush(); // DB에 영구 반영

    }

    @Test
    void test1() {
        Member member = memberRepository.findById(1L).orElse(null);
        System.out.println(member);

        Member member2 = memberRepository.findById(1L).orElse(null);
        System.out.println(member2);
    }
}
