package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: "+localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2018, 03,23, 13,33,33);
        System.out.println("LocalDateTime1: "+localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("LocalDateTime2: "+localDateTime2);

        /*
        * Getting the time and date from LocalDateTime
        * */

        System.out.println("Hour: "+localDateTime.getHour());
        System.out.println("Minute: "+localDateTime.getMinute());
        System.out.println("Day: "+localDateTime.getDayOfMonth());

        /*
        * Modifying LocalDateTime
        */
        System.out.println("plusHours(): "+localDateTime.plusHours(2));
        System.out.println("minusDays(): "+localDateTime.minusDays(2));
        System.out.println("with(): "+localDateTime.withMonth(12));

        /*
        * Converting LocalDate and LocalTime to LocalDateTime and ViceVersa
        * */

        LocalDate localDate = LocalDate.of(2019, 02,03);
        System.out.println("atTime(): "+localDate.atTime(23,22));

        LocalTime localTime = LocalTime.of(23, 3);
        System.out.println("atDate(): " +localTime.atDate(localDate));

        LocalDateTime localDateTime3 = localTime.atDate(localDate);
        System.out.println("toLocalDate: "+localDateTime3.toLocalDate());
        System.out.println("toLocalTime: "+localDateTime3.toLocalTime());
    }
}
