package uz.dilshod.code.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime : " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 12, 29, 20, 0);
        System.out.println("LocalDateTime of : " + localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("LocalDateTime from LocalDate and LocalTime : " + localDateTime2);

        System.out.println("LocalDateTime hour : " + localDateTime.getHour());
        System.out.println("LocalDateTime minute : " + localDateTime.getMinute());
        System.out.println("LocalDateTime getDayOfMonth : " + localDateTime.getDayOfMonth());
        System.out.println("LocalDateTime getDayOfWeek : " + localDateTime.getDayOfWeek());
        System.out.println("LocalDateTime getDayOfYear : " + localDateTime.getDayOfYear());
        System.out.println("LocalDateTime getDayOfMonth : " + localDateTime.getDayOfMonth());
        System.out.println("LocalDateTime DAY_OF_MONTH : " + localDateTime.get(ChronoField.DAY_OF_MONTH));

        System.out.println("LocalDateTime plusHours : " + localDateTime.plusHours(5));
        System.out.println("LocalDateTime minusDays : " + localDateTime.minusDays(7));
        System.out.println("LocalDateTime withMonth : " + localDateTime.withMonth(11));
    }
}
