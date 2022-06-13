package DateTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample {
    public static void main(String[] args) {
       LocalTime localTime = LocalTime.now();
       System.out.println("LocalTime: "+localTime);

       LocalTime localTime1 = LocalTime.of(23, 23);
       System.out.println("LocalTime1: "+localTime1);

        LocalTime localTime2 = LocalTime.of(23, 23, 33);
        System.out.println("LocalTime2: "+localTime2);


        /*
        * Getting the Values from LocalTime instance
        * */

        System.out.println("getHour(): "+localTime.getHour());
        System.out.println("getMinute(): "+localTime.getMinute());
        System.out.println("get Temporal: "+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("toSecondOfDay(): "+localTime.toSecondOfDay());

        /*
        * Modify value of LocalTime
        * */

        System.out.println("minusHours(): " +localTime.minusHours(2));
        System.out.println("MIDNIGHT: " +localTime.with(LocalTime.MIDNIGHT));
        System.out.println("HOUR_OF_DAY: " +localTime.with(ChronoField.HOUR_OF_DAY, 22));
        System.out.println("plusMinutes(): " +localTime.plusMinutes(27));
    }
}
