package object;

public class CarClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car("Toyota",2000);

        System.out.println(car1);

        Car car2 = (Car) car1.clone();

        System.out.println(car2);

    }
}
