package oop.abstraction.abstracCar;

public class CarDemo {
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan("Volvo", 50);
        Sedan sedan2 = new Sedan("BMW", 80);

        SportCar sportCar1 = new SportCar("Ferrary", 120);

        Truck truck = new Truck("MAN", 40);

        Car[] cars = {sedan1, sedan2, sportCar1, truck};

        for (int i = 0; i < cars.length; i++) {
            cars[i].speedUp();
        }

    }
}
