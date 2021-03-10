package homework24;

import java.util.List;
import java.util.Random;

public class Deck {

    private final List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public void mixingDeck(){
        for (int i = 0; i < cards.size(); i++){
            Card card = cards.get(random());
            cards.add(random(), card);
        }
    }

    public void print(){
        for (Card next : cards) {
            System.out.println(next);
        }
    }

    private int random(){
        Random random = new Random();
        return random.nextInt(cards.size() - 1);
    }
}
