package oop.polimorfizm.interfaces;

public class SwimmDemo {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        duck.fly();

        Fish fish = new Fish();
        fish.swim();

        Eagle eagle = new Eagle();
        eagle.fly();


    }
}
