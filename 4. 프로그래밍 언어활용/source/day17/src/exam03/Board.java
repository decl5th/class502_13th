package exam03;

public class Board {

    private static Board instance;

    private Board () {}

    public static Board getInstance() {
        if(instance == null) {
            instance = new Board(); // 호출하면 한번만 객체 생성
        }

        return instance;
    }
}
