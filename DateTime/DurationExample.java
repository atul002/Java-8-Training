package DateTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.of(7,29);
        LocalTime localTime2 = LocalTime.of(8,22);

        long diff = localTime1.until(localTime2, ChronoUnit.MINUTES);
        System.out.println("Difference: "+diff);

        Duration duration = Duration.between(localTime1, localTime2);
        System.out.println("toMinutes: "+duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println("toMinutes: "+duration1.toMinutes());

    }
}
