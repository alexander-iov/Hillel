package lesson22;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Supplier<Integer> supplier = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return random.nextInt(10);
        };

        Stream.generate(supplier)
                .map(i -> i = (int) Math.pow(i, 3))
                .filter(i -> i > 100)
                .limit(100)
                .forEach(System.out::println);
    }
}
