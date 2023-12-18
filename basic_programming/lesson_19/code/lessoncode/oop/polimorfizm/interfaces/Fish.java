package oop.polimorfizm.interfaces;

public class Fish implements Swimmable{

    @Override
    public void swim() {
        System.out.println("Рыбка уплыла!");
    }
}
