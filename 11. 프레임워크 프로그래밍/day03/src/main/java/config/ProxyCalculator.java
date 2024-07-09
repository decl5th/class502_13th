package config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect // 공통 기능이 정의된 클래스라고 알려주는 애너테이션
public class ProxyCalculator {

    @Pointcut("execution(* exam01..*(..))") // exam01에 있는 모든 클래스 모든 메서드라는 패턴 표현
    public void publicTarget() {}

    @Before("publicTarget()")
    public void before(JoinPoint joinPoint){
        System.out.println("Befroe..");
    }

    @After("publicTarget()")
    public void after(JoinPoint joinPoint){
        System.out.println("After..");
    }

    @AfterReturning(value = "publicTarget()", returning = "returnValue")
    public void afterReturning(JoinPoint joinPoint, Object returnValue) {
        System.out.println("AfterReturning:" + returnValue);
    }

    @AfterThrowing(value = "publicTarget()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("AfterThrowing..");
    }

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        Signature sig = joinPoint.getSignature();
        System.out.println(sig.toLongString());

        Object[] args = joinPoint.getArgs(); // 인수 정보
        System.out.println(Arrays.toString(args));

        Object obj = joinPoint.getTarget(); // 폴더
        System.out.println(obj.getClass());

        long stime = System.nanoTime(); // 공통 기능
        try {

            Object result = joinPoint.proceed(); // 핵심 기능 대신 실행 (핵심 기능 : 팩토리얼)

            return result;
        } finally {
            long etime = System.nanoTime(); // 공통 기능
            System.out.printf("걸린시간: %d%n", etime - stime);
        }
    }
}
