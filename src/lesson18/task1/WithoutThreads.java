package lesson18.task1;

public class WithoutThreads {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        String[] strings = new String[10000000];
        for (int i = 0; i < strings.length; i++) {
            if (i % 3 == 0) {
                strings[i] = "Fizz";
            }
            if (i % 5 == 0) {
                strings[i] = "Buzz";
            }
            if (i % 5 == 0 & i % 3 == 0) {
                strings[i] = "FizzBuzz";
            } else {
                strings[i] = String.valueOf(i);
            }
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }
}
