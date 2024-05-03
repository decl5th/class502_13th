package exam02;

import java.util.stream.IntStream;

public class Ex14 {
    public static void main(String[] args) {
        //int total = IntStream.rangeClosed(1, 100).sum(); // 1~100까지 더하는 소스코드 Stream이용한
        int total = IntStream.rangeClosed(1, 100).filter(x -> x % 2 == 1).sum(); // 나머지 값을 이용한 홀수 연산
        System.out.println(total);
    }
}
