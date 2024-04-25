package exam05;

import java.lang.Math.*;
import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println(Math.random() * 3); // 3보다 작은 실수로 반환 => 연산하는 수 n보다 작은 실수 반환

        // 로또 1 ~ 43, 6개의 랜덤 숫자 - 중복 x
        int count = 0;
        int[] lotto = new int[6];

        while (count < 6) {
            int num = getNumber();
            if (checkDuplicate(lotto, num)) { // 중복 체크하는 반복구문
                continue;
            }

            lotto[count] = num;
            count++;
        }

        System.out.println(Arrays.toString(lotto));


        //int num = (int)Math.ceil(Math.random() * 43)  ; // 0 ~ 42 정수 범위 무작위 호출
        // == (int)(Math.random() * 43) +1;

    }

    public static int getNumber() {
        return (int)(Math.random() * 43) + 1; // 따로 빼서 정의
    }

    public static boolean checkDuplicate(int[] lotto, int num) {
        for (int n : lotto) {

            if (n == num) return true; // 중복 되면 반복 중단 구문
        }
        return false;
    }
}
