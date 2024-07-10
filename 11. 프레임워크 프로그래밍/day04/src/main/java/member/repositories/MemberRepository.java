package member.repositories;

import member.entities.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {
    // 기본적으로 스프링 컨테이너 안에 관리 객체으로 들어가 있다

}
