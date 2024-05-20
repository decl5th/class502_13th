package exam01;

public class Ex07 {
    public static void main(String[] args) throws InterruptedException{
        Thread th = new Thread(() -> {
            Thread th2 = Thread.currentThread();
            while(true) {

                try{
                    System.out.println("isInterrupted: " + th2.isInterrupted());
                for (int j = 0; j < 1000000000L; j++);
                    Thread.sleep(10000); // 일시정지
                } catch (InterruptedException e) { // 실행 대기
                     System.out.println("InteruptedExcetpion 예외 에러 발생");
                }
            }
        });
        th.start();

        Thread.sleep(3000);

        th.interrupt(); //InterruptedException 발생,
    }
}
