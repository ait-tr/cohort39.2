package date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateExample8 {
    public static void main(String[] args) {

        String stringDate = "2024-01-12 12:20";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(stringDate,formatter);

        System.out.println(dateTime);

        ZoneId zoneId = ZoneId.of("Europe/Berlin");

        System.out.println(dateTime.atZone(zoneId));



    }
}
