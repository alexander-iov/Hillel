package lesson21.task3;

import java.util.Map;
import java.util.function.BiFunction;

public enum MathOperations {
    PLUS, MINUS, DIVIDE, MULTIPLY;

    Map<MathOperations, BiFunction<Integer, Integer, Integer>> map;

    BiFunction<Integer, Integer, Integer> plusFunction = Integer::sum;

    BiFunction<Integer, Integer, Integer> minusFunction = (a, b) -> {
        return a - b;
    };

    BiFunction<Integer, Integer, Integer> divideFunction = (a, b) -> {
        return a / b;
    };

    BiFunction<Integer, Integer, Integer> multiplyFunction = (a, b) -> {
        return a * b;
    };

}
