package member.dao.sub;

import org.springframework.stereotype.Repository;

@Repository("memberDao2") // 이름을 다르게 설정해서 bean 충돌의 경우를 처리
public class MemberDao {
}
