package lesson18.task3;

public class Main {
    MyDate date1 = new MyDate(new MyDate.Month("July"), 7);
    MyDate date2 = new MyDate(new MyDate.Month("August"), 26);
    MyDate date3 = new MyDate(new MyDate.Month("August"), 26, new MyDate.DayOfWeek("Monday"));
    MyDate date4 = new MyDate(new MyDate.Month("August"), 26, new MyDate.DayOfWeek("Tuesday"));
}
