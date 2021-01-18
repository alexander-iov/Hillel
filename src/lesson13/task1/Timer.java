package lesson13.task1;

import java.time.Duration;
import java.time.LocalDateTime;

public class Timer {
    public static void main(String[] args) {
        var timeMonday = LocalDateTime.of(2021, 1, 18, 20, 0);
        var timeThursday = LocalDateTime.of(2021, 1, 21, 22, 0);
        Duration duration = Duration.between(timeMonday, timeThursday);
        System.out.println("Между занятиями : \n" + duration.toHours() + " Часов\n" +
                duration.toMinutes() + " Минут\n" +
                duration.toSeconds() + " Секунд");
    }
}
