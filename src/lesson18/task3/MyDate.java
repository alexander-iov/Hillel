package lesson18.task3;

public class MyDate {

    private Month month;
    private int day;
    private DayOfWeek dayOfWeek;

    public MyDate(Month month, int day) {
        this.month = month;
        this.day = day;
    }

    public MyDate(Month month, int day, DayOfWeek dayOfWeek) {
        this.month = month;
        this.day = day;
        this.dayOfWeek = dayOfWeek;
    }

    static class Month {
        private String name;

        public Month(String name) {
            this.name = name;
        }
    }

    static class DayOfWeek {
        private String name;

        public DayOfWeek(String name) {
            this.name = name;
        }
    }
}
