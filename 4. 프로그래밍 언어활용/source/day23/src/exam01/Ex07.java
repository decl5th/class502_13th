package exam01;

public class Ex07 {
    private static boolean autoSave = false;

    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(() -> {
            while(true) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {}
                System.out.println("저장!");  //3초가 지나면 자동 저장 문자 출력
            }
        });

        th.setDaemon(true); // 현재 작업 중인 쓰레드 종료되면 같이 종료
        th.start(); // 자동 세이브 기능이 들어가있는 thread 메서드

        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println(i);
            if(i == 3) {
                autoSave = true; // 3초가 되면 세이브 기능을 활성화 시키겠다는 메서드
            }
        }
    }
}
