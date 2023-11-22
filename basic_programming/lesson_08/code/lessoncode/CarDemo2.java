import java.util.Arrays;

public class CarDemo2 {
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


        Car[] garage1 = {car1,car2,car3,car4,car5,car6,car7,car8,car9,car10};

        System.out.println(Arrays.toString(garage1));

        System.out.println(garage1.length);

        for (int i = 0; i < garage1.length; i++) {
            System.out.println(garage1[i]);
        }


    }
}
