package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate: "+localDate);

        LocalDate localDate1 = LocalDate.of(2012, 06, 13);
        System.out.println("LocalDate.of(): "+localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2018, 365);
        System.out.println("LocalDate.ofYearDay(): "+localDate2);

        /*
        * Get Values from LocalDate
        * */

        System.out.println("getMonth(): "+localDate.getMonth());
        System.out.println("getMonthValue(): "+localDate.getMonthValue());
        System.out.println("getDayOfWeek(): "+localDate.getDayOfWeek());
        System.out.println("getDayOfYear(): "+localDate.getDayOfYear());

        System.out.println("Day of Month using get: "+localDate.get(ChronoField.DAY_OF_MONTH));


        /*
        * Modifying Local Date
        * */

        System.out.println("plusDays(): "+localDate.plusDays(2));
        System.out.println("plusMonths(): "+localDate.plusMonths(2));
        System.out.println("minusDays(): "+localDate.minusDays(2));
        System.out.println("minusMonths(): "+localDate.minusMonths(2));

        System.out.println("withYear(): "+localDate.withYear(2023));
        System.out.println("with ChronoField: "+localDate.with(ChronoField.YEAR, 2020));
        System.out.println("with TemporalAdjusters: "+localDate.with(TemporalAdjusters.firstDayOfNextMonth()));


        /*
        * Additional Support  Methods
        * */

        System.out.println("LeapYear: "+localDate.ofYearDay(2024, 01).isLeapYear());
        System.out.println("isEqual(): "+localDate.isEqual(localDate1));
        System.out.println("isBefore(): "+localDate.isBefore(localDate1));
        System.out.println("isAfter(): "+localDate.isAfter(localDate1));

    }
}
