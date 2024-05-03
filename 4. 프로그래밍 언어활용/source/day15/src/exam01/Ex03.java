package exam01;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        Random ran = new Random();

        ran.ints().limit(6).forEach(System.out::println);
        // 정수 범위에서 난수 발생, 6 = 발생시킬 난수 갯수
    }
}
