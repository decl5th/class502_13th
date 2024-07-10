package exam01;

import config.AppCtx;
import mappers.member.MemberMapper;
import member.entities.Member;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class Ex03 {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    void test1() {
        long total = memberMapper.getTotal();
        System.out.println("total = " + total);
    }

    @Test
    void test2() {
        Member member = Member.builder()
                .email("user10@test.org")
                .password("12345678")
                .userName("user10")
                .build();
        int result =memberMapper.register(member);

        Member member2 = memberMapper.get(member.getEmail());
        System.out.println("member2 = " + member2);

        int exists = memberMapper.exists(member.getEmail());
        System.out.println("exists = " + exists);
    }

}
