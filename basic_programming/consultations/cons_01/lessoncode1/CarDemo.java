package lessoncode1;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", false);
        car1.beep("This is VOLVO!");
        boolean isEngineStart = car1.startEngine();
        System.out.println(isEngineStart);

        Car car2 = new Car("Toyota", true);
        boolean isEngineStart2 = car2.startEngine();
        System.out.println(isEngineStart2);

    }
}
