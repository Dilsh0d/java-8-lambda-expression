package uz.dilshod.code.datetime;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Period:
 *      Period is date-based representation of time is Days, Months and Years and is part of the java.time package.
 *
 *      Compatible with LocalDate.
 *
 *      It represents a Period of Time not just a specific date and time.
 *
 * Use - Case
 *      Mainly used calculate the difference between the two dates.
 *
 *      Example:
 *      LocalDate localDate = LocalDate.of(2019,8,8);
 *      LocalDate localDate1 = LocalDate.of(2020,8,8);
 *
 *      Period period = Period.between(localDate, localDate1); // calculate the difference between the two dates
 *
 */
public class DatesPeriodExample {

    public static void main(String[] args) {
        LocalDate fromDate = LocalDate.of(2021,04,8);
        LocalDate toDate = LocalDate.of(2021,8,16);

        Period period = fromDate.until(toDate);
        System.out.println("Period getDays : "+ period.getDays()); // result is 8
        System.out.println("Period getMonths : "+ period.getMonths()); // result is 4
        System.out.println("Period getYears : "+ period.getYears()); // result is 0

        Period period1 = Period.ofDays(10);
        System.out.println("Period ofDays(10).getDays : "+ period1.getDays());

        Period period2 = Period.ofYears(10);
        System.out.println("Period ofDays(10).getYears : "+ period2.getYears());
        System.out.println("Period ofDays(10).toTotalMonths : "+ period2.toTotalMonths());

        Period period3 = Period.between(fromDate,toDate);
        System.out.println("Period getDays, getMonths : "+period3.getDays()+" : "+ period3.getMonths()+" : "+ period3.getYears());

    }
}
