package exam01.config;

import exam01.member.dao.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan(basePackages = "exam01.member")
@ComponentScan("exam01.member") // 스캔할 범위 설정 후 특정 애너테이션이 있는 클래스는 자동적으로 객체 생성 의존성도 주입
public class AppCtx3 {
    // 설정 클래스
    @Bean
    public MemberDao memberDao() {
        System.out.println("수동 등록 빈!");
        return new MemberDao();
    }


}
