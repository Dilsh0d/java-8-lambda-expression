package uz.dilshod.code.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormatterExample {

    public static void parseLocalDateTime() {
        String dateTime = "2023-02-13T11:56:47";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println("localDateTime : "+localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("localDateTime1 : "+localDateTime1);

        // Custom defined format
        String dateTime1 = "2023-02-13T11|56|47";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime1,dateTimeFormatter);
        System.out.println("localDateTime2 : "+localDateTime2);

        String dateTime2 = "2023-02-13abc11|56|47";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime3 = LocalDateTime.parse(dateTime2,dateTimeFormatter1);
        System.out.println("localDateTime3 : "+localDateTime3);
    }

    public static void formatLocalDateTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime format : "+localDateTime.format(dateTimeFormatter));
    }

    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }
}
