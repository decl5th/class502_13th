package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Order(1)
public class ProxyCache {

    private Map<Long, Object> data = new HashMap<>();
    /*
    @Pointcut("execution(* exam01..*(..))")
    public void publicTarget() {}

    @Around("publicTarget()")
     */
    @Around("CommonPointcut.publicTarget()") // 같은 패키지안에 위치하고 있다면 패키지명 생략 가능
    public Object process(ProceedingJoinPoint joingPoint) throws Throwable {

        Object[] args = joingPoint.getArgs();
        Long num = (long)args[0];
        if (data.containsKey(num)) { // 이미 캐시에 저장된 결과 값이 있으면
            System.out.println("캐시 사용...");
            return data.get(num);
        }

        Object result = joingPoint.proceed();
        data.put(num, result); // 캐시에 저장
        System.out.println("캐시에 저장"); // 캐시값을 사용하는 지 확인용도
        return result;
    }
}
