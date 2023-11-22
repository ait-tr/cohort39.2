import java.util.Arrays;

public class CarDemo {
    public static void main(String[] args) {

        Car car1 = new Car("producer 1", "model 1");
        Car car2 = new Car("producer 2", "model 2");
        Car car3 = new Car("producer 3", "model 3");
        Car car4 = new Car("producer 4", "model 4");
        Car car5 = new Car("producer 5", "model 5");
        Car car6 = new Car("producer 6", "model 6");
        Car car7 = new Car("producer 7", "model 7");
        Car car8 = new Car("producer 8", "model 8");
        Car car9 = new Car("producer 9", "model 9");
        Car car10 = new Car("producer 10", "model 10");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        System.out.println("=====================");

        Car[] garage1 = new Car[10];

        System.out.println(garage1);
        System.out.println(Arrays.toString(garage1));

        garage1[0] = car1;
        garage1[1] = car2;
        garage1[2] = car3;
        garage1[3] = car4;
        garage1[4] = car5;
        garage1[5] = car6;
        garage1[6] = car7;
        garage1[7] = car8;
        garage1[8] = car9;
        garage1[9] = car10;

        System.out.println(Arrays.toString(garage1));


        car5.setModel("MERCEDES");
        System.out.println(car5);

        System.out.println(Arrays.toString(garage1));

    }
}
