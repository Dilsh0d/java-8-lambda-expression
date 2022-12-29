package uz.dilshod.code.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime : "+localTime);

        LocalTime localTime1 = LocalTime.of(12,57);
        System.out.println("LocalTime of 1 : "+localTime1);

        LocalTime localTime2 = LocalTime.of(12,57, 13);
        System.out.println("LocalTime of 2 : "+localTime2);

        LocalTime localTime3 = LocalTime.of(12,57, 13, 999);
        System.out.println("LocalTime of 3 : "+localTime3);

        LocalTime localTime4 = LocalTime.MAX;
        System.out.println("LocalTime MAX : "+localTime4);

        LocalTime localTime5 = LocalTime.MIN;
        System.out.println("LocalTime MIN : "+localTime5);

        System.out.println("LocalTime getHour : "+localTime.getHour());
        System.out.println("LocalTime getMinute : "+localTime.getMinute());
        System.out.println("LocalTime getSecond : "+localTime.getSecond());
        System.out.println("LocalTime getNano : "+localTime.getNano());

        System.out.println("LocalTime ChronoField.CLOCK_HOUR_OF_DAY : "+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("LocalTime ChronoField.CLOCK_HOUR_OF_AMPM : "+localTime.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println("LocalTime toSecondOfDay : "+localTime.toSecondOfDay());

        System.out.println("LocalTime minusHours : " + localTime.minusHours(2));
        System.out.println("LocalTime minusMinutes : " + localTime.minusMinutes(212));
        System.out.println("LocalTime minus ChronoUnit.HOURS : " + localTime.minus(5, ChronoUnit.HOURS));
        System.out.println("LocalTime MIDNIGHT : " + localTime.with(LocalTime.MIDNIGHT));
        System.out.println("LocalTime HOUR_OF_DAY : " + localTime.with(ChronoField.HOUR_OF_DAY,22));

        System.out.println("LocalTime plusHours : " + localTime.plusHours(7));
        System.out.println("LocalTime withHour : " + localTime.withHour(13));
    }
}
