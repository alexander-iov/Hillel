package lesson13.task4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm yyyy/MM/dd");
        System.out.println(LocalDateTime.now().format(dateTimeFormatter));
    }
}
