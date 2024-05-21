package exam01;

public class Board {
    private static Board instance;

    private Board() {} // 생성자를 private으로 한정

    public static Board getInstance() { // 싱글톤 패턴
        synchronized (Board.class) { // 쓰레드 안정성을 위해 동기화 블록 입력
            if (instance == null) {
                instance = new Board();
            }

            return instance;
        }
    }
}
