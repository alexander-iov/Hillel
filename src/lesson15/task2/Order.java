package lesson15.task2;

import java.time.LocalDate;

public abstract class Order {

    private LocalDate date;
    private String number;

    public Order(LocalDate date, String number) {
        this.date = date;
        this.number = number;
    }

    public abstract void confirm();

    public abstract void close();

}
