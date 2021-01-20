package lesson13.task3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Parsing {
    public static void main(String[] args) {
        String date = "1999/Jun/18 07:34:55 PM";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/LLL/dd hh:mm:ss a", Locale.US);
        LocalDateTime ldt = LocalDateTime.parse(date, dateTimeFormatter);
        System.out.println(ldt);
    }
}