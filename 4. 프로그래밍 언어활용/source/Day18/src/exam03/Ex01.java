package exam03;

import java.text.DecimalFormat;

public class Ex01 {
    public static void main(String[] args) {
        double num1 = 10000000000.123;

        DecimalFormat numFormat = new DecimalFormat("0,000.00000000"); // 소수점을 4자까지 표기하는 것으로 설정
        String num1Str = numFormat.format(num1);
        System.out.println(num1Str);

        DecimalFormat numFormat2 = new DecimalFormat("#,###.####");
        String num1str2 = numFormat2.format(num1);
        System.out.println(num1str2);
    }
}
