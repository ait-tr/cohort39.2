package referenceType;

import org.w3c.dom.ls.LSOutput;

public class DogDemo {
    public static void main(String[] args) {
        int x = 10;
        boolean isGrey = true;
        char firstLetter = 'A';

        Dog myDog = new Dog();

        System.out.println(x);
        System.out.println(isGrey);
        System.out.println(firstLetter);

        System.out.println("=============");
        System.out.println(myDog);

        myDog.age = 2;

        myDog.weight = 52.5;

        System.out.println("Вес собаки = " + myDog.weight);

        Dog mySecondDog = new Dog();

        mySecondDog.age = 3;
        mySecondDog.weight = 15;

        System.out.println("Возраст первой собаки: " + myDog.age);
        System.out.println("Возраст второй собаки: " + mySecondDog.age);
    }

}
