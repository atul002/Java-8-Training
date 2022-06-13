package DateTime;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Instant: "+instant);

        //Jan 1 1970 -> EPOCH -> 86400 Seconds
        System.out.println("Get EpochSeconds: "+instant.getEpochSecond());
        System.out.println("ofEpochSecond(0): "+Instant.ofEpochSecond(0));

        Instant instant1 = Instant.now();

        Duration duration =  Duration.between(instant, instant1);
        System.out.println("Duration: "+duration.getNano());
    }
}
