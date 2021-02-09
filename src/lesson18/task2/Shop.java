package lesson18.task2;

import java.util.Queue;
import java.util.TimerTask;

public class Shop extends TimerTask {
    private final int maxCapacity = 5;
    private static boolean isOpen;
    private static Queue<Customer> queue;

    public Shop(boolean isOpen, Queue<Customer> queue) {
        Shop.isOpen = isOpen;
        Shop.queue = queue;
        System.out.println("Магазин открылся");
    }

    private void goToTimeOut() throws InterruptedException {
        isOpen = false;
        System.out.println("Магазин ушел на перерыв. Клиентов было: " + queue.size());
        Thread.sleep(10_000);
        queue.clear();
    }

    @Override
    public void run() {
        try {
            goToTimeOut();
            System.out.println("Магазин снова работает. Клиентов: " + queue.size());
            isOpen = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class AddCustomer extends TimerTask {

        @Override
        public void run() {
            if (queue.size() < 5 & isOpen) {
                queue.add(new Customer());
                System.out.println("Новый покупатель. Клиентов: " + queue.size());
            }
        }
    }

    static class DeleteCustomer extends TimerTask {

        @Override
        public void run() {
            if (queue.size() > 1) {
                queue.remove();
                System.out.println("Покупатель ушел. Клиентов: " + queue.size());
            }
        }
    }
}
