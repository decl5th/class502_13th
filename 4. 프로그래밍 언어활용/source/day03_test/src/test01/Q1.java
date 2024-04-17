package test01;

public class Q1 {
    public static void main(String[] args) {
        int num1 = 20;
        double num2 = 3.0;

        int result1 = (int)(num1 + num2);
        int result2 = (int)(num1 - num2);
        int result3 = (int)(num1 * num2);
        int result4 = (int)(num1 / num2);

        System.out.println("더하기 연산값: " + result1);
        System.out.println("빼기 연산값: " + result2);
        System.out.println("곱하기 연산값: " + result3);
        System.out.println("나누기 연산값: " + result4);

    }
}
