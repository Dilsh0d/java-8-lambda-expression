package uz.dilshod.code.datetime;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Time Zones
 *
 * ZoneDateTime, ZoneId, ZoneOffset
 *
 * ZoneDateTime - Represents the date/time with its time zone
 *
 * ZoneOffset - 05:00
 * ZoneId -> America/Chicago
 *
 */
public class TimeZoneExample {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime : " +zonedDateTime);

        System.out.println("ZoneOffset : "+ zonedDateTime.getOffset());
        System.out.println("Zone Id : "+ zonedDateTime.getZone());
//        System.out.println("AvailableZoneIds : "+ ZoneId.getAvailableZoneIds());

        ZoneId.getAvailableZoneIds()
                .stream()
                .forEach(zone -> System.out.println(zone));

        System.out.println("Number of Zones : "+ZoneId.getAvailableZoneIds().size());

        System.out.println("US/Pacific : "+ ZonedDateTime.now(ZoneId.of("US/Pacific")));
        System.out.println("Jamaica : "+ ZonedDateTime.now(ZoneId.of("Jamaica")));
        System.out.println("Poland : "+ ZonedDateTime.now(ZoneId.of("Poland")));

        System.out.println("ZonedDateTime.now(Clock.system(ZoneId.of : "+ZonedDateTime.now(Clock.system(ZoneId.of("Poland"))));

        LocalDateTime localDateTime =LocalDateTime.now(ZoneId.of("Poland"));

        System.out.println("Poland : "+localDateTime);
    }
}
