package exam01;

public class Ex06 {
    public static void main(String[] args) {
        Thread th = new Thread(() -> {
            Thread th2 = Thread.currentThread();
            int num = 0;
            while(!th2.isInterrupted()) {
                // isInterrupted -> interrupt가 호출되었다면 true값 반환
                // 근데 앞에 !가 붙어서 false로 출력 while문 정지
                System.out.println(num++);

                for (long j = 0; j < 1000000000L ; j++);
            }
        });
        th.start();
        try {
            Thread.sleep(3000);
            // sleep 내부적으로 interrupted() 호출  -> InterruptedException 발생 -> isInterrupted() false 값 반환
        } catch (InterruptedException e) {}

        th.interrupt(); // isInterrupted() -> true
                        // intererrupted() -> true
    }
}
