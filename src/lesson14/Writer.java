package lesson14;

import java.util.List;
import java.util.Random;

public class Writer implements Runnable {

    private List<Integer> numbers;

    public Writer(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int i = 10;
        while (i > 0) {
            try {
                Thread.sleep(2_500);
                numbers.add(random());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
        }

    }

    private int random() {
        Random random = new Random();
        return random.nextInt();
    }
}
