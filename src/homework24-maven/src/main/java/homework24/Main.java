package homework24;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("beans.xml");
        Deck deck = xmlContext.getBean("deck", Deck.class);
        System.out.println(deck);
    }
}
