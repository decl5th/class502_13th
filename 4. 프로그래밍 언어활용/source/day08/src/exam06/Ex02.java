package exam06;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {10, 20, 30, 40};

        boolean isSame = Arrays.equals(arr1, arr2);
        System.out.println(isSame);

        // 위의 구문과 아래 주석 처리된 구문의 기능은 동일하다

        /*
        boolean areTheySame = true;
        for(int i = 0; i < arr1.length; i++ ) { // 배열이 같은지 아닌지 구분하는 구문
                if (arr1[i] != arr2[i]) {
                    isSame = false;
                    break;
                }
            }
        System.out.println(areTheySame);

         */

    }
}

