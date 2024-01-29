package lambda;

public class AvgExample1 {
    public static void main(String[] args) {
        IAverage average;

        average = (a,b,c) -> (a + b + c) / 3.0;

        System.out.println("Our average amount = " + average.avg(10,20,30));
    }

}
