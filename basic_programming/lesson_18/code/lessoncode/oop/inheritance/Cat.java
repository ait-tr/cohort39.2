package oop.inheritance;

public class Cat extends Animal{


    public Cat(String name) {
        super(name);
    }

    public void greeting(){
        System.out.println("Cat name " + getName());
    }

}
