package exam12;

public class Outer {
    public Calculator method(int num3) { // 멤버 변수 정의 -> but 자동 상수화 되버림

        Calculat
        or cal = new Calculator() { // 외부 클래스 메서드 내부에서 객체 생성
          public int add(int num1, int num2) {
              // num3 = 100; 성립 안됨 왜? -> final int num3 자동 적용 -> 지역 변수의 상수화
              return num1 + num2 + num3; // 인터페이스의 미구현된 메서드 기능 구현, num3은 메서드에서 넘어오는 값
          }
        };

       /* int result = cal.add(10, 20); // 내부에서 변수 고정 시킨 상태
        System.out.println(result);
        */

        return cal;
    }
}
