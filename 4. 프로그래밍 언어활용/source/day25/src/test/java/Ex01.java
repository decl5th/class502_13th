import exam01.AccountCalcul;

public class Ex01 {
    public static void main(String[] args) {
        AccountCalcul ex01_1 = new AccountCalcul();
        Thread th1 = new Thread(ex01_1);
        Thread th2 = new Thread(ex01_1);
        th1.start();
        th2.start();
    }
}
