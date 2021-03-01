package lesson1.task2;

public class Main {
    public static void main(String[] args) {
        int a = -6;
        int b = 6;
        System.out.println(abs(a) + " " + abs(b));
    }

    public static int abs(int i) {
//        if (i < 0) {
//            return -i;
//        } else {
//            return i;
//        }
        return (i < 0) ? -i : i;
    }
}
