package exam01;

import exam02.CalculatorHandler;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class Ex02 {

    @Test
    void test1(){
        Object obj = Proxy.newProxyInstance(
                Calculator.class.getClassLoader(),
                new Class[]{Calculator.class},
                new CalculatorHandler(new RecCalculator())
                // new CalculatorHandler(new ImplCalculator()) Rec대신에 impl이 들어가도 똑같이 결과물이 출력
        );

        Calculator cal = (Calculator) obj;
        long result = cal.factorial(10L);
        System.out.printf("cal: %d%n", result);

    }
}
