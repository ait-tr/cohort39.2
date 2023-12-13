package oop.inheritance.dog;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();

        SmallDog smallDog = new SmallDog("Бусинка");
        System.out.println(" Моя собака - " + smallDog.getName());
        smallDog.eat();
        smallDog.voice();

        BigDog bigDog = new BigDog("Muhtar");
        bigDog.voice();

        Dog dogMaybeSmall = new SmallDog("small very small");
        dogMaybeSmall.voice();

    }
}
