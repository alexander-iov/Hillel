package lesson13.task2;

import java.time.Duration;
import java.time.LocalTime;

public class DurationTest {
    public static void main(String[] args) {
        LocalTime from = LocalTime.of(20, 0);
        LocalTime to = LocalTime.of(22, 0);
        Duration duration = Duration.between(from, to);
        System.out.println("Количество минут в занятии: " + duration.toMinutes() +
                "\nКоличество секунд в занятии: " + duration.toSeconds());
    }
}
