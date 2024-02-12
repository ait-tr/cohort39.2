package date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateExample7 {
    public static void main(String[] args) {

        String stringDate = "Sat, April 4, 2020";
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);

        try{
            Date date = sdf.parse(stringDate);
            System.out.println(sdf.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}
