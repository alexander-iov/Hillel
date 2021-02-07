package lesson18.task1;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ThreadRunner threadRunner = new ThreadRunner(10, 10_000_000);
        threadRunner.filling();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
