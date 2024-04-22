package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Order cloth = new Order();
        cloth.buy();
        cloth.sell();

        Buyer buyer = cloth;
        buyer.buy();


        Seller seller = cloth;
        seller.sell();


    }
}
