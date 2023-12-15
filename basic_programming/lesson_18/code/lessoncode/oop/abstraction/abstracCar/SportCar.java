package oop.abstraction.abstracCar;

public class SportCar extends Car{
    public SportCar(String model, Integer speed) {
        super(model, speed);
    }

    @Override
    void speedUp() {
        System.out.println("SportCar " + getModel() + " speedUp!");
        setSpeed(getSpeed() + 25);
        System.out.println("Текущая скорость: " + getSpeed());
    }
}
