package lesson15.task2;

import java.time.LocalDate;

public class SpecialOrderFactory implements OrderFactory {
    @Override
    public Order createOrder(String number) {
        return new SpecialOrder(LocalDate.now(), number);
    }
}
