package exam01;

public class Ex08 {
    public static void main(String[] args) throws InterruptedException {
        Ex08Inter th1 = new Ex08Inter("*");
        Ex08Inter th2 = new Ex08Inter("&&");
        Ex08Inter th3 = new Ex08Inter("###");

        th1.start();
        th2.start();
        th3.start();

        Thread.sleep(2000);
        th1.suspend(); // 일시 정지 -> resume 하면 재시작

        Thread.sleep(2000);
        th2.suspend();

        Thread.sleep(3000);
        th1.stop(); // 정지; 쓰레드 종료
        th2.stop();

        Thread.sleep(2000);
        th3.stop();
        // th3가 정지가 늦게 되는 이유는 멀티 코어에 각각 존재하는 캐시 메모리 때문에
        // 연산이 캐시 메모리에 각각 따로 저장되어
        // 실행되는 과정에서 값이 달라져 정확하게 동작하지 않을 수 있다,,,?

    }
}
