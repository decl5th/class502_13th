package exam02;

import java.util.Arrays;

public class Check {
    public static void main(String[] args) {
        String input = "2024 05";
        String[] data = input.split("\\s+");
        System.out.println(Arrays.deepToString(data));
        int year = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        System.out.printf("---- %d년 %d월 ----%n", year, month);
    }
}
