package uz.dilshod.code.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate : "+localDate);

        LocalDate localDate1 = LocalDate.of(2019,8,8);
        System.out.println("LocalDate1 : "+localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2007, 277);
        System.out.println("LocalDate2 : "+localDate2);

        System.out.println("Get Month Name: "+localDate.getMonth());
        System.out.println("Get Month Value : "+localDate.getMonthValue());
        System.out.println("Get Day Of Week : "+localDate.getDayOfWeek());
        System.out.println("Get Day Of Year : "+localDate.getDayOfYear());

        System.out.println("ChronoField Day Of Month : "+localDate.get(ChronoField.DAY_OF_MONTH));

        // Modify LocalDate
        System.out.println("LocalDate plusDays : " + localDate.plusDays(2));
        System.out.println("LocalDate plusMonths : " + localDate.plusMonths(2));

        System.out.println("LocalDate minusDays : " + localDate.minusDays(2));
        System.out.println("LocalDate minusMonths : " + localDate.minusMonths(2));

        System.out.println("LocalDate withYear : " + localDate.withYear(2019));
        System.out.println("LocalDate with ChronoField : " + localDate.with(ChronoField.YEAR,2018));
        System.out.println("LocalDate with TemporalAdjusters.firstDayOfNextMonth : " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));

        System.out.println("LocalDate ChronoUnit minus : " + localDate.minus(1 , ChronoUnit.YEARS));
        System.out.println("LocalDate ChronoUnit minus : " + localDate.plus(1 , ChronoUnit.DECADES));

        System.out.println("LocalDate isLeapYear : " + localDate.isLeapYear());
        System.out.println("LocalDate ofYearDay : " + LocalDate.ofYearDay(2021,01));

        System.out.println("LocalDate isEquals : " + localDate.equals(localDate1));
        System.out.println("LocalDate isBefore : " + localDate.isBefore(localDate1));
        System.out.println("LocalDate isAfter : " + localDate.isAfter(localDate1));

        System.out.println("LocalDate ChronoUnit isSupported : " + localDate.isSupported(ChronoUnit.MINUTES));

    }
}
