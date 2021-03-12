package homework24;

import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public void print(){
        for (Card next : cards) {
            System.out.println(next);
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void mixing(){
        List<Card> temp = getCards();
        for (int i = 0; i < temp.size(); i++){
            Card card = temp.get(random());
            temp.add(random(), card);
        }
        setCards(temp);
    }
    private int random(){
        Random random = new Random();
        return random.nextInt(cards.size() - 1);
    }

}
