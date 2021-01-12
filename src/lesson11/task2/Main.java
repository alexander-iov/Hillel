package lesson11.task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 0, 8, 12, 4, 0, 8, 9, 2, 3, 5, 2};
        for (int i = 10; i >= 0; i--) {
            try {
                System.out.println(divide(numbers));
            } catch (ArrayIndexOutOfBoundsException | DivideByZeroException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static int divide(int[] numbers) {
        Random random = new Random();
        int firstNumber = numbers[random.nextInt(numbers.length)];
        int secondNumber = numbers[random.nextInt(numbers.length)];
        if ((firstNumber | secondNumber) > numbers.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Случайный индекс больше длины массива");
        }
        if (secondNumber == 0) {
            throw new DivideByZeroException("Нельзя делить на 0");
        }
        return firstNumber / secondNumber;
    }


}
