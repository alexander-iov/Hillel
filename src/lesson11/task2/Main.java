package lesson11.task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 0, 8, 12, 4, 0};
        for (int i = 10; i >= 0; i--) {
            try {
                divide(numbers);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex.getMessage());
            } catch (DivideByZeroException e) {
                try {
                    divide(numbers);
                } catch (DivideByZeroException | ArrayIndexOutOfBoundsException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    private static void divide(int[] numbers) {
        int firstIndex = random(numbers);
        int secondIndex = random(numbers);
        if ((firstIndex | secondIndex) > numbers.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Случайный индекс больше длины массива");
        }
        if (numbers[secondIndex] == 0) {
            throw new DivideByZeroException("Нельзя делить на 0");
        }
        System.out.println(numbers[firstIndex] / numbers[secondIndex]);
    }

    private static int random(int[] numbers){
        Random random = new Random();
        return random.nextInt(numbers.length + 1);
    }


}
