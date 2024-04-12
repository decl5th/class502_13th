package exam01;

public class Ex12 {
    public static void main(String[] args) {
        int num1 = 13;
        double num2 = 3.6;

        // 곱셈 결과를 정수로 표현
        double num3 = num1 * num2;
        int num4 = (int)num3;
        System.out.println(num4);

        // 정답
        int num5 = (int)(num1 * num2); // (int)(13 * 3.6)
        System.out.println(num5);
    }
}
