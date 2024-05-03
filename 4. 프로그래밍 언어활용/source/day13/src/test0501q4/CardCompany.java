package test0501q4;

public class CardCompany extends Card{
    private static CardCompany instance = new CardCompany();
    private int cardNumber = 10;

    private CardCompany() {}

    public static CardCompany getInstance() {
        if(instance == null)
            instance = new CardCompany();
        return instance;
    }

    public Card createCard() {
        Card card = new Card();
        card.setCardNumber(cardNumber++);
        return card;
    }
}
