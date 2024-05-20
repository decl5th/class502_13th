package exam01;

public class Ex01_1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++ ) {
            System.out.println("쓰레드 - " + i);
        }
    }
}
