package lesson5.task1;

public class Calculator {

    public int plus(int [] arr) {
        int c = 0;
        for (int num : arr) {
            c = +num;
        }
        return c;
    }

    public double multiply(double a, double b) {
        return a + b;
    }
}
