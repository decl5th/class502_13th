package exam01;

public class RunnAble  implements Runnable{
    @Override
    public void run() {

        Thread th = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(th.getName() + " 쓰레드 - " + i);
        }
    }
}
