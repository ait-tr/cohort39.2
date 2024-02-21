package funcInterfaceDemo;

public class AvgWithLambda {
    public static void main(String[] args) {
        //IAverage ref = (a,b,c) -> (a + b + c) / 3.0;

        printAvg((a,b,c) -> (a + b + c) / 3.0,3,7,8, "Среднее арифметическое:");
        printAvg((a,b,c) -> (a * b * c) / 3.0,3,7,8, "Произведении трех элементов деленное на количество элементов");
    }

    public static void printAvg(IAverage ref, double a, double b, double c, String message){
        System.out.println(message);
        System.out.println("avg = " + ref.avg(a,b,c));
    }
}
