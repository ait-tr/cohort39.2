package interfaces.example1;

public class DemoApp {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", "G500");
        Moto moto = new Moto("BMW", "R 1600 GTL");
        BiCycle biCycle = new BiCycle("Specialized", 7);
        Yacht yacht = new Yacht("SuperYacht", 42);

        Vehicle[] vehicles = {car, moto, biCycle, yacht};

        SpecialSignal[] specialSignalsVehicles = {car, moto, yacht};

        for (int i = 0; i < specialSignalsVehicles.length; i++) {
            specialSignalsVehicles[i].signal();
        }
    }
}
