package exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex05 {
    // Stream은 일회용이다의 증명
    public static void main(String[] args) {
        int[] nums = {22, 11, 15, 35, 40, 77};

        IntStream stm = Arrays.stream(nums); // 일회용 객체
        int total = stm.map(x -> x * x).sum(); //map(IntUnaryOperator)
        System.out.println(total);

        stm = Arrays.stream(nums); // 재정의 => 새로 다시 생성
        int total2 = stm.map(x -> x * x * x).sum();
        System.out.println(total2);
    }
}
