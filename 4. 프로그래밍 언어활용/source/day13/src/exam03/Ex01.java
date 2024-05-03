package exam03;

import java.util.function.BiFunction;

public class Ex01 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> calc = (a, b) -> a + b;
        // Integer 객체 - 언박싱
        // 반환값 - 오토박싱
        // 오토박싱과 언박싱의 반복 -> 성능 저하
        int result = calc.apply(10,20);
        System.out.println(result);
    }
}
