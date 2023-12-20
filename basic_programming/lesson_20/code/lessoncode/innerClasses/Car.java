package innerClasses;

public class Car {
    private String carModel;

    class EngineInner {
        void start() {
            System.out.println("Двигатель запущен");
        }
    }

    public void createEngine() {
        EngineInner engine = new EngineInner();
        engine.start();
    }

    public static void main(String[] args) {
       Car car = new Car();
       car.createEngine();

       Car car2 = new Car();
       Car.EngineInner engine = car2.new EngineInner();
       engine.start();

    }
}
