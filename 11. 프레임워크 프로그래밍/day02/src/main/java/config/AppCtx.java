package config;

import global.annotation.ManualBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages="member", excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ManualBean.class)) // ManualBean이 포함되어 있는 자동 스캔에 해당하는 클래스는 객체를 만들지 않고 배제
public class AppCtx {

}
