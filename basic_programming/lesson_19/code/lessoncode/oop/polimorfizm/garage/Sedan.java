package oop.polimorfizm.garage;

public class Sedan extends Car implements Beep{


    public Sedan(String model, Integer speed) {
        super(model, speed);
    }

    @Override
    void speedUp() {
        System.out.println("Sedan " + getModel() + " speedUp!");
        setSpeed(getSpeed() + 10);
        System.out.println("Текущая скорость: " + getSpeed());
    }

    @Override
    public void soundBeep() {
        System.out.println("Sedan beep!");
    }
}
