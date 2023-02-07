package uz.dilshod.code.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Duration
 *      A time based representation of time in hours, minutes, seconds and nanoseconds
 *      Compatible with LocalTime and LocalDateTime
 *      It represents a duration of time not just a specific time
 *
 *      Duration duration1 = Duration.ofHours(3);
 *      Duration duration2 = Duration.ofMinutes(3);
 *
 *      LocalTime localTime - LocalTime.of(7,20)
 *      LocalTime localTime1 - LocalTime.of(8,20)
 *
 *      Duration duration3 = Duration.between(localTime,localTime1);
 */
public class DurationExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(7,20);
        LocalTime localTime1 = LocalTime.of(8,20);

        long diff = localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("Diff : "+diff);

        Duration duration= Duration.between(localTime,localTime1);
        System.out.println("Duration : "+duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println("OfHours : "+ duration1.toMinutes());

        Duration duration2 = Duration.ofDays(3);
        System.out.println("OfDays : "+ duration2.toMinutes());

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now().plusDays(10);

//        Duration duration3 = Duration.between(localDate,localDate1);
//        System.out.println("LocalData duration between " + duration3.toHours());
    }
}
