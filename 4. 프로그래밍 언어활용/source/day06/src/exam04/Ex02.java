package exam04;

public class Ex02 {
    public static void main(String[] args) {
        Order food = new Order();

        System.out.println(food.MIN_ORDERPRICE + "원");
        food.order(); // Buyer의 order 인스턴스 메서드
        food.sell();
        food.buy();
        //food.orderFromBuyer();
        food.buyerorder();
        food.sellerOrder();
        food.orderFromSeller();

        Seller.staticMethod();

    }
}
