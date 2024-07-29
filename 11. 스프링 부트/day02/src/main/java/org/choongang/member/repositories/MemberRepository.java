package org.choongang.member.repositories;

import org.choongang.member.entities.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    //Optional<Member> findByEmail(String email);
    // email로 회원 조회하는 쿼리 메서드, null 값도 조회하거나 처리할 경우 옵셔널로 감싸는 형태로도 가능
    Member findByEmail(String email);

    Page<Member> findByEmailContaining(String keyword, Pageable pageable);
    // pageable, 정렬 => pageable쓰면 반환값이 달라짐 -> 기본적인 페이지 형태로 조회 출력 기능

    List<Member> findByEmailContainingAndUserNameContainingOrderByCreatedAtDesc(String key1, String key2);
    // 쿼리메서드의 단점: 조건이 조금만 늘어나도 코드가 길어진다
}
