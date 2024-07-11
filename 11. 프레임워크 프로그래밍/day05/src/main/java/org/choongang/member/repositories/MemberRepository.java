package org.choongang.member.repositories;

import org.apache.ibatis.annotations.Param;
import org.choongang.member.entities.Member;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, Long> {
    Member findByEmail(String email);
    List<Member> findByUserNameContaining(String keyword);
    List<Member> findByUserNameContainingAndEmailContainingOrderByRegDtDesc(String key1, String key2); // 쿼리 메서드의 단점 복잡한 쿼리는 코드가 너무 길어진다

    @Query("SELECT * FROM MEMBER WHERE USER_NAME LIKE '%:param1%' AND EMAIL LIKE '%:param2%' ORDER BY REG_DT DESC")
    List<Member> getMembers(@Param("param1") String key1, @Param("param2")String key2);

}
