package exam10;

public class Ex01 {
    public static void main(String[] args) {

        Outer.Inner in = new Outer.Inner();
        // 객체 생성 없이 기능을 바로 호출하여 실행
        // 객체 생성 X -> this 없음 -> 객체 자원 접근 불가 -> 인스턴스 메서드나 멤버 변수 호출 불가
        in.method();
    }
}
