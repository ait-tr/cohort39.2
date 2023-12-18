package oop.polimorfizm.interfaces;

public class Eagle implements Flying{
    @Override
    public void fly() {
        System.out.println("Орел парит высоко в небе!");
    }
}
