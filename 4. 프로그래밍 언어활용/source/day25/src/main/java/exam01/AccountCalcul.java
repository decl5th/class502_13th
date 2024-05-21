package exam01;

public class AccountCalcul implements Runnable{
    private Account acc = new Account();

    @Override
    public void run() {
        while(acc.getBalance() > 0) {
            // 차감할 수 있는 금액 범위 설정
            int money = (int)(Math.random() * 3 + 1) * 100; // 100~300
            acc.withdraw(money);
            System.out.println("balance : " + acc.getBalance());
        }
    }
}

