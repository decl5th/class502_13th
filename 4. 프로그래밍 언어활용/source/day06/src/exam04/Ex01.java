package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Order cloth = new Order();
        cloth.buy();
        cloth.sell();

        System.out.println("-----형변환------ ");

        Buyer buyer = cloth; // 형변환
        buyer.buy();


        Seller seller = cloth;
        seller.sell();


    }
}
