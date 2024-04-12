package exam01;

public class Ex09 {
    public static void main(String[] args) {
        long num1 = 100000000000L; // 8byte
        double num2 = num1; // 정수 -> 실수로 바꿔도 자동 형변환(묵시적 형변환)이 이루어짐 8byte
        float num3 = num1; // 실수는 기본적으로 모든 정수를 포함할 수 있다 4byte의 float도 8byte의 long을 포함 가능

        double num4 = 0.0;
        for (int i = 0; i< 1000; i++) {
            num4 += 0.1; // 실수 계산의 정밀도가 떨어질 수 잇다
        }

        System.out.println(num4);
    }
}
