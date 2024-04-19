package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule(2024, 3, 20);
        System.out.println(s1);
        // s1.toString();의 포함되어서 출력되며 멤버변수 값을 확인하는 용도로 재정의
        // 출력값 = exam01.Schedule@3b07d329; @뒤의 값은 객체의 주소값을 나타냄

        System.out.println(System.identityHashCode(s1));
        // 16진수로 주소값 표시
        // 주소값 - > 990368553

    }
}
