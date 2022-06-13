package DateTime;

import javax.security.auth.callback.LanguageCallback;
import java.time.*;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime: "+zonedDateTime);

        System.out.println("ZoneOffset: " +zonedDateTime.getOffset());
        System.out.println("ZoneId: "+zonedDateTime.getZone());

        //System.out.println("Available ZoneIDs: "+ZoneId.getAvailableZoneIds());

//        ZoneId.getAvailableZoneIds()
//                .stream()
//                .forEach((zone) -> System.out.println(zone));

        System.out.println("Number of Zones: "+ZoneId.getAvailableZoneIds().size());

        System.out.println("Chicago CST: "+ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("ZonedDateTime using Clock: "+ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago"))));

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Asia/Kolkata: "+localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("Asia/Kolkata")));
        System.out.println("Asia/Kolkata: "+localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("ofInstant: "+localDateTime2);


        /*
        * Convert from LocalDateTime, Instant to ZonedLocalDate and time
        * */
        LocalDateTime localDateTime3 = LocalDateTime.now();
        System.out.println("localDateTime3 :"+localDateTime);

        ZonedDateTime zonedDateTime1 = localDateTime3.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println("zonedDateTime1: "+zonedDateTime1);

        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println("zonedDateTime2: "+zonedDateTime2);
    }
}
