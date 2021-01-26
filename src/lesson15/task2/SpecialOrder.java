package lesson15.task2;

import java.time.LocalDate;

public class SpecialOrder extends Order {

    public SpecialOrder(LocalDate date, String number) {
        super(date, number);
    }

    @Override
    public void confirm() {
        System.out.println("A special order was confirmed");
    }

    @Override
    public void close() {
        System.out.println("A special order was closed");
    }

    public void dispatch() {
        System.out.println("A special order was dispatched");
    }
}
