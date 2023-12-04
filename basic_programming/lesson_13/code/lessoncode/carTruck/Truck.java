package carTruck;

public class Truck {
    Engine engine;
    int wheels;

    public Truck(Engine engine, int wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}
