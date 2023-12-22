package interfaces.example1;

public class Moto extends Vehicle implements SpecialSignal{

    String type;

    public Moto(String producer, String type) {
        super(producer);
        this.type = type;
    }

    public void accelerate(){}

    @Override
    public void signal() {
        System.out.println("BEEEP!!!");
    }
}
