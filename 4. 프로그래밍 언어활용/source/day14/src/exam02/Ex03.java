package exam02;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        /*
        1. 문자열 앞 뒤로 * ... * 붙이기
        2. 대문자 변환
        3. 출력
         */
        String[] fruits = {"apple", "orange", "mango", "melon"};
        Arrays.stream(fruits).map(s -> "*" + s + "*").map(String::toUpperCase).forEach(System.out::println);
        // 메서드 참조
        // stream 객체로 변환 -> map 메서드 적용, 메서드 체이닝 기법 적용
    }
}
