package robot;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("SONY");

        System.out.println(robot1.mark);

        Robot robot2 = new Robot("Huawei");

        robot1.hello();
        robot2.hello();

    }
}
