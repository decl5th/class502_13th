package exam01;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        // 점수가 있는 배열
        int[] scores = {67, 80, 100, 98, 76, 56};
        // 총합을 구해보자
        // intstream sum을 쓰는 게 제일 간단
        int total = Arrays.stream(scores).reduce(0, (n1, n2) -> n1 + n2);// 처음 매개변수로 0
        /*
        (n1, n2) -> n1 + n2 동작 원리
         int total = Arrays.stream(scores).reduce(0, (n1, n2) -> {
          souf("n1=%d, n2=%d%n", n1, n2);
          n1 += n2;
          return n1;
          });
        */

        System.out.println(total);
    }
}
