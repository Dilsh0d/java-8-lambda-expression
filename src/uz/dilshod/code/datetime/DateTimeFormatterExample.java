package uz.dilshod.code.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *  DateTimeFormatter
 *
 *  Introduced in Java 8 and part of the java.time.format package.
 *
 *  Used to parse and format the LocalDate, LocalTime and LocalDateTime.
 *
 *  Parse and Format
 *  parse - Converting a String to LocalDate/LocalTime/LocalDateTime.
 *
 *  format - Converting a LocalDate/LocalDateTime to a String
 *
 * @link: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
 *
 */
public class DateTimeFormatterExample {

    public static void parseLocalDate() {
        // String to LocalDate
        String date = "2023-02-13";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("String date parser : " + localDate);

        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("String date1 parser : " + localDate1);


        String date1 = "20230213"; // yyyyMMdd
        LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("String date2 parser : " + localDate2);

        // Custom defined date - format
        String date2 = "2023|02|13";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(date2, dateTimeFormatter);
        System.out.println("String date3 parser : " + localDate3);

        // Custom defined date - format
        String date3 = "2023*02*13";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate4 = LocalDate.parse(date3, dateTimeFormatter1);
        System.out.println("String date4 parser : " + localDate4);
    }

    public static void formatLocalDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        String dateFormat = localDate.format(dateTimeFormatter);
        System.out.println("DateFormat1 : " +dateFormat);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate1 = LocalDate.now();
        String dateFormat1 = localDate.format(dateTimeFormatter1);
        System.out.println("DateFormat2 : " +dateFormat1);
    }

    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
