package test0501q4;

public class Ex01 {
    public static void main(String[] args) {
        CardCompany company = CardCompany.getInstance();
        Card card1 = company.createCard();
        Card card2 = company.createCard();
        Card card3 = company.createCard();
        System.out.println("Card 1 number: " + card1.getCardNumber());
        System.out.println("Card 2 number: " + card2.getCardNumber());
        System.out.println("Card 3 number: " + card3.getCardNumber());

    }
}
