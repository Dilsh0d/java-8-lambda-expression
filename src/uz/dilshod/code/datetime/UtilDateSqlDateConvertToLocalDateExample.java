package uz.dilshod.code.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class UtilDateSqlDateConvertToLocalDateExample {

    public static void main(String[] args) {

        // java.util.Date convert to LocalDate
        Date date = new Date();
        System.out.println("java.util.Date : "+date);

        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("java.util.Date convert to localDate : "+localDate);

        Date date1 = new Date().from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("localDate convert to java.util.Date : " + date1);

        // java.sql.Date convert to LocalDate
        java.sql.Date date2 = java.sql.Date.valueOf(localDate);
        System.out.println(" java.sql.Date create from LocalDate : "+ date2);

        LocalDate localDate1 = date2.toLocalDate();
        System.out.println("java.sql.Date convert to LocalDate  : "+localDate1);
    }
}
