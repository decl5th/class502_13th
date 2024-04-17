package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student p1 = new Student( 1000, "이이름", "자바"); // 객체 생성
        p1.study(); // 함수가 실행되려면 우선 객체가 먼저 생성되어야 한다

        Student p2 = new Student(1001, "가이름", "리액트");
        p2.study();
    }
}
