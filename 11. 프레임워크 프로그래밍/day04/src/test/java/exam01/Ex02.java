package exam01;

import config.AppCtx;
import member.entities.Member;
import member.repositories.MemberRepository;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class Ex02 {

    @Autowired
    private MemberRepository repository;
    @Autowired
    private DataSource dataSource;

    @Test
    void test1() {
        List<Member> members = (List<Member>) repository.findAll(); //<1>
        members.forEach(System.out::println);
    }

    @Test
    void test2() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        MemberRepository repository = ctx.getBean(MemberRepository.class);
        List<Member> members = (List<Member>) repository.findAll();
        members.forEach(System.out::println);

        ctx.close();
    }

}
