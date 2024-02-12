package date;


import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        String stringDate = "12 February 2024";

        System.out.println(stringDate);

        // java.util.Date

        Date date = new Date();

        System.out.println(date);

        Date date2 = new Date(1212121212121L);
        System.out.println(date2);
    }
}
