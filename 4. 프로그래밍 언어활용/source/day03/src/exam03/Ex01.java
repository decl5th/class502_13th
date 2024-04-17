package exam03;

public class Ex01 {
    public static void main(String[] args) {

        Board b1 = new Board();
        Board b2 = new Board(); // 계속 새로운 메모리 할당

        System.out.println(b1 == b2);
        // false, b1,b2는 각각 다른 객체이면 다른 주소값을 가지고 메모리 공간을 차지하고 있다
    }
}
