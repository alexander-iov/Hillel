package lesson18.task2;

import java.util.Queue;

public class CustomerRunner implements Runnable {

    private Queue<Customer> customers;

    public CustomerRunner(Queue<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public void run() {
        while (true) {
            if (customers.size() > 4) {
                customers.remove();
                System.out.println("Customer is gone");
                System.out.println("Customers in shop: " + customers.size());
                try {
                    Thread.sleep(8000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            customers.add(new Customer());
            System.out.println("New Customer");
            System.out.println("Customers in shop: " + customers.size());
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
