package funcInterfaceDemo;

public class Average {
    public static void main(String[] args) {
        int x = 10;
        int y = 25;
        int z = 25;

        double avg = (x + y + z) / 3.0;

        System.out.println(avg);

        System.out.println(AvgUtil.avg(25,35,42));
    }
}
