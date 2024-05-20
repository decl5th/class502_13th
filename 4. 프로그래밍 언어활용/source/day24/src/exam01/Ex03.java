package exam01;

public class Ex03 {
    public static void main(String[] args) {
        /*
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };*/

        /*
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

         */

        Thread th = new Thread(() -> System.out.println("함수형 인터페이스의 람다식 표현"));
        th.start();
    }
}
