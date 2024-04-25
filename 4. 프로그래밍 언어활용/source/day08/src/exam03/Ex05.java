package exam03;

public class Ex05 {
    public static void main(String[] args) {
        int num1 = 100;
        Integer num2 = Integer.valueOf(200);

        int result1 = num1 + num2; // num2.intValue() -> 언박싱
        System.out.println(result1);
        // 원래는 객체끼리 연산 안됨 근데 왜 돼냐?
        // 컴파일러가 자동으로 형변환을 진행

        // 컴파일러가 자동적으로 객체를 intValue()를 통해 연산이 가능하도록 형변환
        Integer num3 = Integer.valueOf(300);
        Integer num4 = Integer.valueOf(400);

        int result2 = num3 + num4; // num3.intValue() + num3.intValue() 생략되어있지만 자동추가 적용되어있다
        System.out.println(result2);
    }
}
