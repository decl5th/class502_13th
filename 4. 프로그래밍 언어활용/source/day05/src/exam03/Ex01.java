package exam03;

import exam01.C;

public class Ex01 {
    public static void main(String[] args) {
        // Calculator cal = new Calculator(); 객체가 될 수 없다는 오류 -> 추상 클래스니까
        Calculator cal = new SimpleCalculator(); // 추상클래스 에서 객체 생성 가능해짐 -> 변수 정의
        // SimpleCalculator cal = new SimpleCalculator(); -> SimpleCalculatior 에서 함수 기능 내용 정의 -> add함수 뭘 할지 알게됨
        int result = cal.add(10,20); // 값을 대입 했지만 기능을 알 수 없다 -> 함수 역할 수행 불가능 -> 완성된 클래스 X
        // add라는 함수가 아직 뭘 할지 모름 -> 불완전 클래스 -> 정의하면 괜춘

        System.out.println(result);

        System.out.println(cal.num); // 변수 입력하니 Calculator가 객체가 됨
        // 추상클래스에 변수의 값을 입력하면 메모리에 할당받아 객체가 만들어짐

        ComplexityCalculator cal2 = new ComplexityCalculator();
        int result2 = cal2.add(10, 20);
        System.out.println(result2);

    }
}
