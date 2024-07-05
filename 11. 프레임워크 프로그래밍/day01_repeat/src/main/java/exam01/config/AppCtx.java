package exam01.config;

import exam01.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // <- 설정 클래스임을 알려주는 애너테이션
// 설정 클래스: 스프링 컨테이너가 관리할 객체를 정의, 설정
public class AppCtx {

    @Bean // -> 관리할 객체임을 알려주는 애너테이션
    public Greeter greeter() {
        return new Greeter();
    }
}
