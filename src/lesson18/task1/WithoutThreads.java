package lesson18.task1;

public class WithoutThreads {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        String[] strings = new String[10_000_000];
        for (int i = 0; i < strings.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                strings[i] = "BuzzFizz";
            } else if (i % 3 == 0) {
                strings[i] = "Buzz";
            } else if (i % 5 == 0) {
                strings[i] = "Fizz";
            } else {
                strings[i] = String.valueOf(i);
            }
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }
}
