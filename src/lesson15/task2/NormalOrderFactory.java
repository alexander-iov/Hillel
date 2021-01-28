package lesson15.task2;

import java.time.LocalDate;

public class NormalOrderFactory implements OrderFactory {

    @Override
    public Order createOrder(String number) {
        return new NormalOrder(LocalDate.now(), number);
    }
}
