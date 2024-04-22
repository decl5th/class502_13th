package exam04;

public class Order implements Seller, Buyer { // Seller 와 Buyer를 구분하는 용도

    @Override
    public void buy() {
        System.out.println("구매!");
    }

    @Override
    public void sell() {
        System.out.println("판매");
    }

    public void order() {
        System.out.println("직접 정의");
    }

    public void orderFromSeller() {
        Seller.super.sellerOrder();
    }

    public void orderFromBuyer() {
        Buyer.super.buyerorder();
    }




}
