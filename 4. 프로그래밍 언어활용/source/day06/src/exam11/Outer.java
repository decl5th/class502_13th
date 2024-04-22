package exam11;

public class Outer {
    public void method() {
        class Inner {
            public void method() {
                System.out.println("지역 내부 클래스에서 호출");
            }
        }

        Inner inner = new Inner();
        inner.method(); // 메서드 내부에서 클래스 정의 하고 객체 생성 인스터스 메서드 정의
    }

}
