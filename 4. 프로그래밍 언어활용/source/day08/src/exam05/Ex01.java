package exam05;

import static java.lang.Math.*;
// import 하면 앞에 Math는 생략 가능

public class Ex01 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-10)); // 10
        System.out.println(Math.ceil(10.2)); // 11, 올림
        System.out.println(Math.floor(10.2)); // 10, 버림
        System.out.println(Math.round(10.5)); // 11, 반올림

        System.out.println("---------------------------------");

        System.out.println(abs(-10)); // 10
        System.out.println(ceil(10.2)); // 11, 올림
        System.out.println(floor(10.2)); // 10, 버림
        System.out.println(round(10.5)); // 11, 반올림
        System.out.println(pow(2,4)); // 2의 4제곱 => 16
        System.out.println(sqrt(9)); // 9의 루트값 => 3

    }
}
