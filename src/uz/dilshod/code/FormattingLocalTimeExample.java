package uz.dilshod.code;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {

    public static  void parseTime() {
        String time = "15:00";
        LocalTime localTime = LocalTime.parse(time);
        System.out.println("localTime : " +localTime);

        LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("localTime1 : " +localTime1);

        // Custom defined format
        String time1 = "14*00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
        LocalTime localTime2 = LocalTime.parse(time1,dateTimeFormatter);
        System.out.println("localTime2 : " +localTime2);

        String time2 = "16|00";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH|mm");
        LocalTime localTime3 = LocalTime.parse(time2,dateTimeFormatter1);
        System.out.println("localTime3 : " +localTime3);

        String time3 = "17*00*16";
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH*mm*ss");
        LocalTime localTime4 = LocalTime.parse(time3,dateTimeFormatter2);
        System.out.println("localTime4 : " +localTime4);
    }

    public static  void formatTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm*ss");
        LocalTime localTime = LocalTime.now();
        System.out.println(" localTime : "+ localTime.format(dateTimeFormatter));

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH@mm@ss");
        LocalTime localTime1 = LocalTime.now();
        System.out.println(" localTime1 : "+ localTime1.format(dateTimeFormatter1));
    }

    public static void main(String[] args) {
        parseTime();
        formatTime();
    }
}
