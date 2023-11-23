package lessoncode1;

public class Car {
    String model;

    boolean isElectricEngine;

    public Car(String model, boolean isElectricEngine) {
        this.model = model;
        this.isElectricEngine = isElectricEngine;
    }

    public void beep(String message) {
        System.out.println(message);
        System.out.println("Beep! Beep! Beep!");
    }

    public boolean startEngine(){
        System.out.println("Engine form our car " + model + " is starting!");
        System.out.println("We are ready to drive!");
        boolean isStart = true;
        return isStart;
    }

}
