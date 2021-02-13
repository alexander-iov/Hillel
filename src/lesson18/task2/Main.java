package lesson18.task2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();
        Shop shop = new Shop(queue);
        Timer timer = new Timer();
        timer.schedule(shop, 1_000, 30_000);
        Shop.AddCustomer addCustomer = new Shop.AddCustomer();
        Shop.DeleteCustomer deleteCustomer = new Shop.DeleteCustomer();
        timer.schedule(addCustomer, 1000, 500 + (random(4) * 1000));
        timer.schedule(deleteCustomer, 1000, 3000 + (random(6) * 1000));
    }

    private static int random(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }
}
