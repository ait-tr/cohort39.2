package oop.inheritance.animals;

public class Parrot extends Animal{

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void voice(){
        System.out.println("Kesha!!!");
    }

}
