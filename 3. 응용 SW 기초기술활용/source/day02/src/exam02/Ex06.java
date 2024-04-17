package exam02;


import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30}, {40, 50, 60}};
        System.out.println(arr);
        System.out.println(Arrays.deepToString(arr));
/*
        System.out.println(arr.length); // 행의 갯수
        System.out.println(arr[0].length); // 열의 갯수
        System.out.println(arr[1].length);// 열의 갯수
*/

        for (int i = 0; i < arr.length; i++) { //행
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]); // i행 , j열

            }
        }
    }
}