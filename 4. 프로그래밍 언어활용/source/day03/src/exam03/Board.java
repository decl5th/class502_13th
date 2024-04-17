package exam03;

public class Board {
    private Board() {} // 외부에서 직접 호출 안되도록 접근제어자를 통해 통제

    // 내부에서는 통제 가능하기 때문에 클래스 내부에서 static 객체 생성
    private static Board instance = new Board();

    // 객체 반환하는 static 함수 정의
    public static Board getInstance() {
        return instance;
    }

}
