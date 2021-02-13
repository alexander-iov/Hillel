package lesson21.task2;

import java.util.List;
import java.util.function.Predicate;

public class PredicateRunner {
    public static void main(String[] args) {
        List<String> strings = List.of("Card", "bank", "Package", "task", "class");
        String regex = "^[A-Z].*";
        Predicate<String> isInUpperCase = s -> s.matches(regex);
        long count = strings.parallelStream().filter(isInUpperCase).count();
        System.out.println(count);
    }
}
