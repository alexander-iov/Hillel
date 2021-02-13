package lesson18.task1;

import java.time.LocalDateTime;

public class ThreadRunner {

    private static volatile String[] strings;
    private final int threadCount;

    public ThreadRunner(int threadCount, int stringsCount) {
        this.threadCount = threadCount;
        strings = new String[stringsCount];
    }

    public void filling() {
        int part = strings.length / threadCount;
        for (int i = 0; i < threadCount; i++) {
            int end = (strings.length - 1) - part * i;
            int start = part * (threadCount - i - 1);
            new Thread(new StringThread(start, end)).start();
        }
    }

    static class StringThread implements Runnable {

        private final int start;
        private final int end;

        public StringThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    strings[i] = "BuzzFizz";
                } else if (i % 3 == 0) {
                    strings[i] = "Buzz";
                } else if (i % 5 == 0) {
                    strings[i] = "Fizz";
                } else {
                    strings[i] = String.valueOf(i);
                }
                if (i % 1_000_000 == 0) {
                    System.out.println(i + " " + LocalDateTime.now());
                }
            }
        }
    }
}
