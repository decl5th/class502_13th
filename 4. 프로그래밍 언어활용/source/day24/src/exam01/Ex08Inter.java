package exam01;

public class Ex08Inter implements Runnable {

    // 상태값을 메모리에 내보내는 volatile 예약어
    private volatile boolean stopped = false; // 멤버 변수
    private volatile boolean suspended = false; // 멤버 변수

    private Thread th;

    public Ex08Inter(String name) {
        th = new Thread(this, name); // name => thread 이름
    }

    @Override
    public void run() {
        while(!stopped) {
            if (!suspended) {
                System.out.println(th.getName());
                try{
                Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        }
    }

    public void start() {
        th.start();
    }

    public void suspend() {
        suspended = true;
    }

    public void resume() {
        suspended = false;
    }

    public void stop() {
        stopped = true;
    }
}
