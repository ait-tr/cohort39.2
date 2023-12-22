package interfaces.example1;

public class BiCycle extends Vehicle{

    int gear;

    public BiCycle(String producer, int gear) {
        super(producer);
        this.gear = gear;
    }

    public void changeGear(boolean up) {}

}
