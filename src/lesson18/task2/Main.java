package lesson18.task2;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Customer> customers = new LinkedList<>();
        new Thread(new Shop(customers)).start();
        new Thread(new CustomerRunner(customers)).start();
    }

}
