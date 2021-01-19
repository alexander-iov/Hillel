package lesson14;

import java.util.List;

public class Reader implements Runnable {

    private List<Integer> numbers;

    public Reader(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1_000);
            if (numbers.isEmpty()) {
                System.out.println("The list is empty");
            } else {
                for (int num : numbers) {
                    System.out.println(num);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
