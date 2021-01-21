package lesson14;

import java.time.LocalDate;
import java.util.List;

public class Reader implements Runnable {

    private List<Integer> numbers;
    private final LocalDate date = LocalDate.now();

    public Reader(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1_000);
                if (numbers.isEmpty()) {
                    System.out.println(date + " The list is empty");
                } else {
                    System.out.println(numbers);
                    numbers.clear();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
