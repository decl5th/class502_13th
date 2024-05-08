package exam03;

public class Card {
    private static int num;
    private int cardNum;
    private String holder;

    public Card(String holder) {
        this.holder = holder;
        cardNum = ++num;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNum=" + cardNum +
                ", holder='" + holder + '\'' +
                '}';
    }
}
