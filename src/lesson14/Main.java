package lesson14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Reader reader = new Reader(numbers);
        Writer writer = new Writer(numbers);
        Thread thread1 = new Thread(reader, "Reader");
        Thread thread2 = new Thread(writer, "Writer");
        thread2.start();
        thread1.start();
    }
}
