package date;


import java.util.Date;

public class DateExample2 {
    public static void main(String[] args) {

        Date date1 = new Date();

        System.out.println(date1.getTime());

        for (int i = 0; i < 100000000; i++) {

        }

        Date date2 = new Date();
        System.out.println(date2.getTime());


        System.out.println((date1.getTime() < date2.getTime()) ? "дата 1 раньше чем дата2" : "дата 2 раньше чем дата1 ");


        System.out.println(date1.before(date2));
        // after
        //equals

    }
}
