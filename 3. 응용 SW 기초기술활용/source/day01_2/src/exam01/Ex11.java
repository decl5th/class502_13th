package exam01;

public class Ex11 {
    public static void main(String[] args) {
        double num1 = 10.123;
        long num2 = (long)num1; // error 이유 : 실수를 정수형으로 명시했기 때문 데이터 유실을 진행하기 위해 (long)을 붙여 명시적 형변환 실행
        System.out.println(num2);
    }
}
