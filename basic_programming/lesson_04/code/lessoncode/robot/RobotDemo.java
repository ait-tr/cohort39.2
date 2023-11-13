package robot;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("SONY");

        System.out.println(robot1.mark);

        Robot robot2 = new Robot("Huawei");

        robot1.hello();
        robot2.hello();

        double euroValue = robot1.currencyConverter(100, 0.97);

        System.out.println("Из 100 долларов мы получим " + euroValue + " евро");


    }
}
