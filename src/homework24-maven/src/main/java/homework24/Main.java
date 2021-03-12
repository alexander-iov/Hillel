package homework24;

import config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("beans.xml");
//        Deck deck = xmlContext.getBean("deck", Deck.class);
//        deck.print();
        ApplicationContext javaContext = new AnnotationConfigApplicationContext(Config.class);
        Deck bean = javaContext.getBean(Deck.class);
        bean.print();
        bean.mixing();
        bean.print();
    }
}
