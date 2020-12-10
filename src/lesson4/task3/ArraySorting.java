package lesson4.task3;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {0, 2, 4, -10, -16, 8, 7, 3, 1, 11};
        calcArrayPow(sorting(array));
    }

    public static void calcArrayPow(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
        }
        sorting(array);
        System.out.print(Arrays.toString(array));
    }

    private static int[] sorting(int[] array) {

        int n = array.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
