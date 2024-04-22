package exam04;

public class Ex02 {
    public static void main(String[] args) {
        Order food = new Order();

        food.order(); // Buyer의 order 인스턴스 메서드
        food.orderFromBuyer();
        food.orderFromSeller();

        Seller.staticMethod();

    }
}
