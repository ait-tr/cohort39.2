package publicAndPrivate.car;

import publicAndPrivate.car.entity.Car;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();

        car.model = "GLC 250";
        // car.color = "black"; - недоступен пока не будет public


    }
}
