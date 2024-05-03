package exam01;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int[] num1 = {10, 20, 30, 40};
        int[] num2 = {10, 20, 30, 40};

        boolean isSame = Arrays.equals(num1, num2);
        System.out.println(isSame);

        int[][] num3 = {{10,20,30}, {40,50,60}};
        int[][] num4 = {{10,20,30}, {40,50,60}};
        boolean isSame2 = Arrays.equals(num3, num4);
        System.out.println(isSame2);

        boolean isSame3 = Arrays.deepEquals(num3, num4);
        System.out.println(isSame3);
    }
}
