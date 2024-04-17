package test01;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] nums = {21, 22, 30, 11, 99, 31};

        int[] reverseNums = new int[6];

        for(int i = nums.length - 1, j = 0; i >= 0 ; i--, j++) {
             reverseNums[j] =  nums[i];
        }

        System.out.println("역배치: " + Arrays.toString(reverseNums));

    }
}
