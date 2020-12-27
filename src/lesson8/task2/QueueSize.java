package lesson8.task2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSize {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        String[] strings = {"Mango", "Apple", "Pipe", "Book", "String", "Cake"};
        for (String str : strings) {
            queue.offer(str);
        }
        System.out.println(sizeValidation(queue));
    }

    public static Queue<String> sizeValidation(Queue<String> queue) {
        Queue<String> queue1 = new LinkedList<>();
        for (String element : queue) {
            if (element.length() <= 4) {
                queue1.offer(element);
            }
        }
        return queue1;
    }
}
