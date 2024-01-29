package lambda;

public class AvgExample2 {
    public static void main(String[] args) {

        printAverage((a,b,c) -> (a + b + c) / 3.0, 10,20,30);


        printAverage((a,b,c) -> {
            double avg = (a + b + c) / 3.0;
            avg = avg * Math.PI;
            avg = Math.sqrt(avg) / c;
            return avg;
        }, 10,20,30);


        double x = 100;

        IAverage ref = (a,b,c) -> {
            double avg = (a + b + c) / 3.0;
            double result = avg * avg;
            return result;
        };

        printAverage(ref, 10,20,30);

    }

    public static void printAverage (IAverage average, double a, double b, double c) {
        System.out.println("Our average amount = " + average.avg(a,b,c));
    }
}
