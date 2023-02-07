package uz.dilshod.code.datetime;

import java.time.Duration;
import java.time.Instant;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Represent the time in a machine readable format
 *
 * Example
 * Instant ins = Instant.now();
 *
 * Represent the time in seconds from January 01,1970(EPOCH) to current time as a huge number.
 */
public class InstantExample {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Instant.now() : " + instant);

        // Jan 1st 1970 -> Epoch ->  86400 seconds
        System.out.println("getEpochSecond : " + instant.getEpochSecond());

        System.out.println("ofEpochSecond : "+Instant.ofEpochSecond(0));

        Instant instant1 = Instant.now();

        Duration duration =Duration.between(instant,instant1);
        System.out.println("Instant duration : "+ duration.getNano());
    }
}
