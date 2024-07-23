package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;


@SpringBootTest
@Transactional
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex02 {

    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {
        for(long i = 1L; i <= 10L; i++){
            Member member = new Member();
            member.setSeq(i);
            member.setEmail("user" + i + "@test.org");
            member.setPassword("12345678");
            member.setUserName("사용자" + i);
            member.setCreatedAt(LocalDateTime.now());
            em.persist(member); // 영속 상태
        }

        em.flush(); // DB 영구 반영
        em.clear(); // 영속 상태 entity 모두 비우기
    }

    @Test
    void test1() {
        Member member = em.find(Member.class, 1L);
        System.out.println(member);

        Member member2 = em.find(Member.class, 1L);
        System.out.println(member2);

        System.out.println(member == member2);
        System.out.println("member: " + System.identityHashCode(member));
        System.out.println("member2: " + System.identityHashCode(member2));

        member.setUserName("(수정)사용자01");

        //em.flush(); // UPDATE 쿼리 수행
        // 값 변경후, 삭제 상태 변경 후 해당 데이터를 조회 -> 암묵적으로 flush() 수행
        //System.out.println("updateUserName: " + member.getUserName());
        //System.out.println("updateUserName: " +member2.getUserName());

        Member member3 = em.find(Member.class, 1L);
        System.out.println("상태 변경후 flush() 수행 확인: " + member3.getUserName());
    }
}
