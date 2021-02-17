package lesson21.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        Map<MathOperations, BiFunction<Integer, Integer, Integer>> map = new HashMap<>();

        MathOperations PLUS = MathOperations.PLUS;
        MathOperations MINUS = MathOperations.MINUS;
        MathOperations DIVIDE = MathOperations.DIVIDE;
        MathOperations MULTIPLY = MathOperations.MULTIPLY;

        BiFunction<Integer, Integer, Integer> plusFunction = Integer::sum;
        BiFunction<Integer, Integer, Integer> minusFunction = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> divideFunction = (a, b) -> a / b;
        BiFunction<Integer, Integer, Integer> multiplyFunction = (a, b) -> a * b;

        map.put(PLUS, plusFunction);
        map.put(MINUS, minusFunction);
        map.put(DIVIDE, divideFunction);
        map.put(MULTIPLY, multiplyFunction);

        System.out.println(map.get(PLUS).apply(1, 3));
        System.out.println(map.get(MINUS).apply(1, 3));
        System.out.println(map.get(DIVIDE).apply(1, 3));
        System.out.println(map.get(MULTIPLY).apply(1, 3));

    }
}
