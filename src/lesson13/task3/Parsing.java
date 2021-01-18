package lesson13.task3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Parsing {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/LLL/dd hh:mm:ss a", Locale.US);
        System.out.println(LocalDateTime.now().format(dateTimeFormatter));
    }
}
