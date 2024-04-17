package exam02;

public class Ex03 {
    public static void main(String[] args) { // 정적 메서드
        // add(10,20); 오류 뜨는 이유 -> add는 동적 자원 인스턴스 메서드이기 때문에 static으로 정의 되어 있지 않으면 접근 불가
        int result1 = add(10,20);
        System.out.println(result1);

        int result2 = add(30, 40);
        System.out.println(result2);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}
