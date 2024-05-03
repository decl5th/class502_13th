package exam01;

import java.util.function.BiPredicate;
import java.util.function.ToIntFunction;

public class Ex07 {
    public static void main(String[] args) {
        ToIntFunction<String> func1 = s -> s.length();
        ToIntFunction<String> func2 = String::length;
        // 위아래 서로 같은 구문 ; 타입이 분명하고 로직이 하나뿐일 때

        BiPredicate<String, String> cond1 = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> cond2 = String::equals;
        // 매개변수가 정해져 있고 로직도 단순하다면 가능한 참조식
    }
}
