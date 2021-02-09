package lesson18.task2;

import java.util.Queue;

public class Shop implements Runnable {
    private final int maxCapacity = 5;
    private boolean isOpen;
    private final Queue<Customer> queue;

    public Shop(boolean isOpen, Queue<Customer> queue) {
        this.isOpen = isOpen;
        this.queue = queue;
    }

    private void goToTimeOut() throws InterruptedException {
        isOpen = false;
        Thread.sleep(10_000);
        queue.clear();
    }

    @Override
    public void run() {

    }
}
