package DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2016,02,01);
        LocalDate localDate2 = LocalDate.of(2018,01,21);

        /*
        *
        * */

        Period period = localDate1.until(localDate2);
        System.out.println("getDays(): "+period.getDays());
        System.out.println("getMonths(): "+period.getMonths());
        System.out.println("getYears(): "+period.getYears());

        Period period1 = Period.ofDays(10);
        System.out.println("Period.getDays: "+period1.getDays());

        Period period2 = Period.ofYears(12);
        System.out.println("Period.getDays: "+period2.getYears());
        System.out.println("Period.getMonths: "+period2.toTotalMonths());

        Period period3 = Period.between(localDate1, localDate2);
        System.out.println("between: "+period3.getDays()+" : "+period3.getMonths());


    }
}
