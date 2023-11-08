package primitiv;

public class TypeCast {
    public static void main(String[] args) {

        int x = 10;
        double xDouble = x;
        // это равносильно
        double x2Double = (double) x;

        double yDouble = 10.9;
        int y = (int) yDouble;

        System.out.println(y);

        yDouble = 3456437457451.9;
        long yLong = (long) yDouble;
        System.out.println(yLong);




    }
}
