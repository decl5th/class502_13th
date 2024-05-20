package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Thread th = new Thread(new RunnAble());
        th.start();
       // th.run();

        for (int i = 0; i < 5; i++) {
            System.out.println(th.getName() + " 메인 쓰레드 - " + i);
        }
    }
}
