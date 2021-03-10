package homework24;

public class Card {

    private final String value;
    private final String suit;
    private final boolean isTrumpCard;

    public Card(String value, String suit, boolean isTrumpCard) {
        this.value = value;
        this.suit = suit;
        this.isTrumpCard = isTrumpCard;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value='" + value + '\'' +
                ", suit='" + suit + '\'' +
                ", isTrumpCard=" + isTrumpCard +
                '}';
    }
}
