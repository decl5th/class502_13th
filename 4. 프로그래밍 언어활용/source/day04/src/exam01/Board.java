package exam01;

public  class Board {
    // private static Board instance = new Board(); // 정적 변수로 객체를 생성

    private  static Board instance;
    private Board() {} // private으로 외부 접근 통제

    // 내부에서 객체에 접근할 수 있게 함수 및 기능 정의
    public static Board getInstance() {
       if (instance == null) {
           instance = new Board();

       }

        return instance;

    }
}
