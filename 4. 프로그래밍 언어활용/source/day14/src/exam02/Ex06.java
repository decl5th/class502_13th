package exam02;

import java.util.function.IntUnaryOperator;

public class Ex06 {
    public static void main(String[] args) {

    }

    public static int[] map(int[] nums, IntUnaryOperator oper) {
        int[] newNums = new int[nums.length];
        // 스트림 안에 for문이 들어가 있는 구조
        for (int i=0; i < nums.length; i++) {
           newNums[i] = oper.applyAsInt(nums[i]); // 추상메서드 -> 사용자 정의 기능

        }
        return newNums;
    }
}
