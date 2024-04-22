package exam10;

public class Outer {

    int num1 = 10;
    static int num2 = 20;

    static class Inner {
        public void method() {
            System.out.println("정적 내부 클래스에서 호출");
            // System.out.println(num1);
            // 접근 안됨 왜? Outer 클래스의 객체가 되든 관련 없이 접근이 안됨 -> 정적인 메서드는 접근이 안됨

            System.out.println(num2);
        }
    }
}
