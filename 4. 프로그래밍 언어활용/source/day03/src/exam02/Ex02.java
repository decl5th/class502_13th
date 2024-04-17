package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Student.id = 10; // 클래스명으로 접근 가능
        System.out.println(Student.id);

        Student.staticMethod(); // 클래스 명으로만 사용가능 -> 객체 만들지 않았음

    }
}
