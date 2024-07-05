package exam01;

import exam01.config.AppCtx;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {

    @Test
    void test01() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class); // 스프링 컨테이너 객체
        // 생성자 매개변수로 설정클래스-클래스가 들어감

        // 컨테이너안에서 어떤 객체를 꺼내올 것인지를 알려줘야함
        // 메서드명이 빈(객체)의 이름이 됨
        Greeter g1 = ctx.getBean("greeter", Greeter.class); // 객체가 이미 생성된 객체를 꺼내온 것
        // getBean 꺼내올 때 쓰는 메서드

        g1.hello("이이름");

        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        g2.hello("최이름");

        System.out.println(g1 == g2); // 주소 비교: true값 나옴 즉 싱글톤 형태로 객체 관리


        ctx.close();
    }
}
