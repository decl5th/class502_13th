package exam04;// 두 가지 형태의 인터페이스 설계

public interface Buyer {
    public int MIN_ORDERPRICE = 50000;
    void buy();

    default void buyerorder() { // public 범위로 구현된 인스턴스 메서드
        System.out.println("Buyer에서 주문");

        privateMethod();
    }

    private void privateMethod() { // private메서드
        System.out.println("Buyer에서 vip주문");

    }
}
