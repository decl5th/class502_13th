package exam01;

import org.junit.jupiter.api.Test;

public class Ex01 {
    // lombok 테스트
    @Test
    void test1() {
        Member member = new Member();
        member.setUserId("USER01");
        member.setUserNm("사용자01");
        System.out.println(member);
    }
}
