package member.dao;

import global.annotation.ManualBean;
import member.entities.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ManualBean
@Repository // DAO는 DB 접속과 주로 연결되다 보니 레포지토리 애너테이션을 붙여줌
public class MemberDao { // memberDao - 빈 이름

    private static Map<String, Member> members = new HashMap<>();

    public void register(Member member) {
        members.put(member.getEmail(), member);
    }

    public Member get(String email) {
        return members.get(email);
    }

    public List<Member> getList() {
        List<Member> data = new ArrayList<>(members.values());

        return data;
    }
}
