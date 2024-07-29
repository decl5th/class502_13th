package org.choongang.jpa_study;

import org.choongang.member.constants.Authority;
import org.choongang.member.entities.Member;
import org.choongang.member.repositories.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex05 {
    // 레포지토리를 가지고 엔티티 관련 쿼리 테스트 수행
    @Autowired
    private MemberRepository memberRepository;

    @BeforeEach
    void init() {
        List<Member> members = IntStream.rangeClosed(1, 10)
                // 정수를 멤버 객체 형태로 변환
                .mapToObj(i -> Member.builder()
                        .email("user" + i + "@test.org")
                        .password("12345678")
                        .userName("사용자" + i)
                        .authority(Authority.USER)
                        .build()).toList(); // 10명의 회원 데이터를 List형태로 가공

        memberRepository.saveAllAndFlush(members);
        /*
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
         */
    }

    @Test
    void test1() {
        Member member = memberRepository.findById(1L).orElse(null);
        System.out.println(member);

        member.setUserName("(수정)사용자01");
        memberRepository.save(member);
        //memberRepository.flush();

        Member member2 = memberRepository.findById(1L).orElse(null);
        System.out.println(member2);

        memberRepository.delete(member2);
        memberRepository.flush();
    }

    @Test
    void test2() {
        List<Member> members = memberRepository.findAll();
        members.forEach(System.out::println);
    }
}
