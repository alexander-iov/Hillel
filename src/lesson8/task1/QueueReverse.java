package lesson8.task1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueReverse {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        String[] strings = {"1", "2", "3", "4", "5", "6"};
        for (String str : strings) {
            queue.offer(str);
        }
        System.out.println(reverse(queue));
    }

    public static Queue<String> reverse(Queue<String> queue){
        Deque<String> queue1 = new LinkedList<>();
        for (String element : queue){
            queue1.addFirst(element);
        }
        return queue1;
    }
}
