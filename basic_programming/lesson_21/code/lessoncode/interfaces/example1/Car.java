package interfaces.example1;

public class Car extends Vehicle implements SpecialSignal {

    String model;

    public Car(String producer, String model) {
        super(producer);
        this.model = model;
    }

    public void start(){}

    @Override
    public void signal() {
        System.out.println("SIRENA!!!");
    }
}
