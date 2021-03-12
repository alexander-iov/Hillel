package config;

import homework24.Card;
import homework24.Deck;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config {

    @Bean
    public Deck deck(List<Card> cards) {
        return new Deck(cards);
    }

    @Bean("aceSpades")
    public Card cardAceSpades() {
        return new Card("Ace", "Spades", true);
    }

    @Bean("aceHearts")
    public Card cardAceHearts() {
        return new Card("Ace", "Hearts", false);
    }

    @Bean("aceCross")
    public Card cardAceCross() {
        return new Card("Ace", "Cross", false);
    }

    @Bean("aceDiamonds")
    public Card cardAceDiamonds() {
        return new Card("Ace", "Diamonds", false);
    }

    @Bean("jackSpades")
    public Card cardJackSpades() {
        return new Card("Jack", "Spades", true);
    }

    @Bean("jackHearts")
    public Card cardJackHearts() {
        return new Card("Jack", "Hearts", false);
    }

    @Bean("jackCross")
    public Card cardJackCross() {
        return new Card("Jack", "Cross", false);
    }

    @Bean("jackDiamonds")
    public Card cardJackDiamonds() {
        return new Card("Jack", "Diamonds", false);
    }

    @Bean("tenSpades")
    public Card cardTenSpades() {
        return new Card("Ten", "Spades", true);
    }

    @Bean("tenHearts")
    public Card cardTenHearts() {
        return new Card("Ten", "Hearts", false);
    }

    @Bean("tenCross")
    public Card cardTenCross() {
        return new Card("Ten", "Cross", false);
    }

    @Bean("tenDiamonds")
    public Card cardTenDiamonds() {
        return new Card("Ten", "Diamonds", false);
    }
}
