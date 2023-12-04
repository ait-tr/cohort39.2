package carTruck;

public class Car {

    /*
    1. Создайте класс для описания автомобиля
у автомобиля должны быть следующие характеристики:
- model
- объем двигателя
- цвет
- трансмиссия ручная или автомат

2. Автомобиль должен уметь:
- сигналить
- начинать движение
- останавливаться
     */

    String model;
    double engine;
    String color;
    boolean transmissionAuto;

    public Car(String model, double engine, String color, boolean transmissionAuto) {
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.transmissionAuto = transmissionAuto;
    }

    public void beep(){
        System.out.println("This is " + model + "! BEEP!");
    }

    public void start(){
        String textMessage = "Start engine! ";
        System.out.println(textMessage + engine);
    }

    public void stop(){}

}
