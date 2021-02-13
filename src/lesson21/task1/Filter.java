package lesson21.task1;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> collect = integers.parallelStream()
                .filter(integer -> integer % 2 == 0)
                .map(integer -> integer * integer)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
