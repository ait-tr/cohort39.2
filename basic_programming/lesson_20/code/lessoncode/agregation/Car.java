package agregation;

public class Car {
    private String carName;
    private Engine engine;

    public Car(String carName, Engine engine) {
        this.carName = carName;
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
        System.out.println(carName + " готов к поездке ");
    }
}
