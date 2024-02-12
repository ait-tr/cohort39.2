package date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample6 {
    public static void main(String[] args) {

        String stringDate = "2024-02-12 19:15:45";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try{
            Date date = sdf.parse(stringDate);
            System.out.println(date.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}
