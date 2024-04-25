package exam06;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        // 다차원 배열의 경우 -> 중첩된 형태의 경우일 때
        int [][] arr1 = {{1,2,3}, {4,5,6}};
        int [][] arr2 = {{1,2,3}, {4,5,6}};

        boolean isSame = Arrays.deepEquals(arr1, arr2);
        System.out.println(isSame);

    }
}
