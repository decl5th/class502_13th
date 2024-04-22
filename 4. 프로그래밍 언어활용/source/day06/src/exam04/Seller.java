package exam04;

public interface Seller {
    void sell();

    default void sellerOrder () {
        System.out.println("Seller에서 주문");
    }

    public static void staticMethod() { // 정적 메서드
        System.out.println("Seller 인터페이스에서 접근 가능");
    }

}
