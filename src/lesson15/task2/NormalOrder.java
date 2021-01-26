package lesson15.task2;

import java.time.LocalDate;

public class NormalOrder extends Order {

    public NormalOrder(LocalDate date, String number) {
        super(date, number);
    }

    @Override
    public void confirm() {
        System.out.println("Confirm an order");
    }

    @Override
    public void close() {
        System.out.println("Close an order");
    }

    public void dispatch() {
        System.out.println("An order was dispatched");
    }

    public void receive() {
        System.out.println("Customer received an order");
    }
}
