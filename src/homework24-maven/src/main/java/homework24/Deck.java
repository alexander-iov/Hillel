package homework24;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public void print() {
        for (Card next : cards) {
            System.out.println(next);
        }
        System.out.println();
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void mixing() {
        List<Card> temp = new ArrayList<>();
        System.out.println("Перетасовка");
        while (cards.size() != 0) {
            Card remove = cards.remove(random());
            temp.add(remove);
        }
        setCards(temp);
    }

    private int random() {
        Random random = new Random();
        return Math.max(random.nextInt(cards.size()) - 1, 0);
    }

}
