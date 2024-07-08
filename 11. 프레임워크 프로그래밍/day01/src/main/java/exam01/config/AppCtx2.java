package exam01.config;

import exam01.member.dao.MemberDao;
import exam01.member.services.InfoService;
import exam01.member.services.JoinService;
import exam01.member.validators.JoinValidator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.format.DateTimeFormatter;

@Configuration // 관리할 객체가 뭔지 정해줄 수 있는 설정 클래스임을 알려주는 애너테이션
public class AppCtx2 {

    @Bean // 스프링이 관리할 객체임을 알려주는 애너테이션
    @Qualifier("mDao")
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberDao memberDao2() {
        return new MemberDao();
    }

    @Bean
    public JoinValidator joinValidator() {
        JoinValidator joinValidator = new JoinValidator();

        return joinValidator;
    }

    @Bean
    public JoinService joinService() {
        return new JoinService(joinValidator(), memberDao());
       // return new JoinService();
    }

    @Bean
    public InfoService infoService() {
        InfoService infoService = new InfoService();

        return infoService;
    }
    @Bean // 자바 jdk, 외부 라이브러리는 수동 등록이 필수
    public DateTimeFormatter dataTimeFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
        return formatter;
    }
}
