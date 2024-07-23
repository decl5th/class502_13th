package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex01 {

    /*@Autowired
    private EntityManagerFactory emf;
     */

    @Autowired
    private EntityManager em;

    @Test
    void test1() {
        //EntityManager em = emf.createEntityManager(); // 이미 빈으로 만들어져 있다

        EntityTransaction tx = em.getTransaction();

        tx.begin(); // Transaction 시작 ㄷ
        Member member = new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setUserName("사용자01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member); // 영속 상태 - 변화 감지 메모리에 있다, 변화 감지...

        em.flush(); // INSERT 쿼리

        em.detach(member); // 영속 상태 분리 - 변화 감지 X

        member.setUserName("(수정)사용자01"); // 변경
        member.setModifiedAt(LocalDateTime.now());

        em.flush();

        em.remove(member); // 제거 상태, 제거 X, 상태만...
        em.flush();

        tx.commit();
    }
}