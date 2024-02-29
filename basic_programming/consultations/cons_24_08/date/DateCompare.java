package date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateCompare {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate deadLine = LocalDate.of(2024,2,1);

        if (deadLine.isAfter(currentDate)) {
            System.out.println("Deadline еще не наступил!");
            long dayBeforeDeadline = ChronoUnit.DAYS.between(currentDate,deadLine);
            System.out.println("До срока поставки: " + dayBeforeDeadline + " дней.");
        } else if (deadLine.isEqual(currentDate)) {
            System.out.println("Срок поставки сегодня");
        } else {
            System.out.println("Срок поставки ужк прошел!");
            long dayAfterDeadline = ChronoUnit.DAYS.between(deadLine,currentDate);
            System.out.println("От срока поставки прошло " + dayAfterDeadline + " дней.");

        }
     }
}
