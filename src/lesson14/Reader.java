package lesson14;

import java.util.List;

public class Reader implements Runnable {

    private List<Integer> numbers;

    public Reader(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int i = 25;
        while (i >= 0) {
            try {
                Thread.sleep(1_000);
                if (numbers.isEmpty()) {
                    System.out.println("The list is empty");
                } else {
                    System.out.println(numbers);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
        }

    }
}
