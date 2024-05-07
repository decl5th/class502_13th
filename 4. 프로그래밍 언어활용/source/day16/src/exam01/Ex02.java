package exam01;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        // Random 클래스 사용, 정수 범위의 100개의 난수를 생성
        // 무작위로 수를 생성했지만 홀수가 없을 수도 있는 가능성 존재
        // 그래서 findFirst() 뒤에 OptionalInt의 형태로 반환값
        // 그런 가능성에 대한 orElse를 통해 기본값 설정
        Random rand = new Random();
        int firstOdd = rand.ints(100)
                            .filter(x -> x % 2 ==1)
                            .findFirst()
                            .orElse(-1);
        System.out.println(firstOdd);
    }
}
