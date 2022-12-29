package uz.dilshod.code.datetime;

import jdk.jshell.execution.LoaderDelegate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Introduction to New date/Time Libraries
 *
 *      LocalDate, LocalTime and LocalDateTime and part of the java.time package.
 *
 *      These new classes are created with the inspiration from the Joda - Time library
 *
 *      All the new time libraries are Immutable.
 *
 *      Supporting classes like Instant, Duration, Period and etc.
 *
 *      Date, Calendar prior to Java 8.
 *
 *      LocalDate - Used to represent the date.
 *      LocalTime - Used to represent the time.
 *      LocalDateTime - Used to represent the and time.
 */
public class IntroductionDateTimeApi {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate : " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime : " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime : " + localDateTime);
    }
}
