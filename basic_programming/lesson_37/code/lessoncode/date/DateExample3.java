package date;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample3 {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar(2024,1,12);

        //System.out.println(calendar);

        Date date = calendar.getTime();

        System.out.println(date);


        calendar = new GregorianCalendar(2024,Calendar.JANUARY,30);

        System.out.println(calendar.getTime());

    }
}
