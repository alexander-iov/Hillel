package lesson18.task2;

import java.util.Queue;

public class Shop implements Runnable {

    private final Queue<Customer> customers;

    public Shop(Queue<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public void run() {
        while (true) {
            if (customers.size() < 4) {
                System.out.println("Shop is not working");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Shop is working");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
