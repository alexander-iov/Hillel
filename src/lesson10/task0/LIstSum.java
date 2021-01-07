package lesson10.task0;

import java.util.ArrayList;
import java.util.List;

public class LIstSum {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(6);
        integers.add(7);
        System.out.println(sum(integers));
    }

    public static <T extends Number> double sum(List<T> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).doubleValue();
        }
        return sum;
    }
}
