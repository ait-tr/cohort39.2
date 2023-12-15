package oop.abstraction.abstractAnimal;

public class Parrot extends Animal {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void voice(){
        System.out.println("My parrot: " + getName());
    }

}
