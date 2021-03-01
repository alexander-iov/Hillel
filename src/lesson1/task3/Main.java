package lesson1.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E'};
        System.out.println(Arrays.toString(reverse(chars)));
    }

    public static char[] reverse(char[] chars) {
        char[] reverse = new char[chars.length];
        for (int i = 0, j = reverse.length - 1; i < chars.length; i++, j--) {
            reverse[i] = chars[j];
        }
        return reverse;
    }
}
