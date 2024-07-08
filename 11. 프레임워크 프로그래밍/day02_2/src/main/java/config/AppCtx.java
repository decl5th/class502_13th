package config;

import exam03.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppCtx {

    @Bean // 스프링 컨테이너 안에 객체생성
    public RecCalculator recCalculator() {
        return new RecCalculator();
    }
}
