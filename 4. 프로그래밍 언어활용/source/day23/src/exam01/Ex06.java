package exam01;

import javax.swing.*;

public class Ex06 {
    public static void main(String[] args) throws InterruptedException {
        /*
            Runnable r = () -> {
            };

            Thread th = new Thread(r)
         */
        Thread th = new Thread(() -> { // 멀티쓰레드 환경 구축
            String message = JOptionPane.showInputDialog("메세지 입력");
            System.out.println(message);
        });

        th.start();

        for (int i = 1; i <= 10; i++) { // main 쓰레드 돌아가는 반복문
            System.out.println(i);

            Thread.sleep(1000);
        }
    }
}
