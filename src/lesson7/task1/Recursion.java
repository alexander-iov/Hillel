package lesson7.task1;

public class Recursion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        showArray(array, 0);
    }

    public static void showArray(int[] array, int position) {
        if (position >= array.length) {
            return;
        } else {
            System.out.println(array[position]);
        }
        showArray(array, position + 1);
    }
}
