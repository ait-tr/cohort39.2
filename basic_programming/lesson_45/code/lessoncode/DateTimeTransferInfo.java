import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTransferInfo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        String formatDate = now.toString();

        String formatDateCustom = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println(formatDate);
        System.out.println(formatDateCustom);


        String dateTimeFormatMessage = "2024-03-01T12:00:00";

        LocalDateTime receivedDateTime = LocalDateTime.parse(dateTimeFormatMessage);

        System.out.println(receivedDateTime);
    }
}
