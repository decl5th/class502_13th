package exam01;

public class Outer {

    private Calculator cal2 = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1 + num2 ;
        }
    };

    public Calculator method(int num3) { // void -> Calculator가 됨으로서 자료형 일치와 외부로부터의 접근이 가능해짐
        return new Calculator() {
            // Calculator cal -> 지역 변수로의 대입 -> 스택 영역에 저장
            //new Calculator -> 객체 생성 -> 힙 영역에 저장
            public int add(int num1, int num2) {
                return num1 + num2 + num3; // 인터페이스를 가지고 미구현된 메서드를 재정의하면서 추상메서드
            }
        };

    }
}
