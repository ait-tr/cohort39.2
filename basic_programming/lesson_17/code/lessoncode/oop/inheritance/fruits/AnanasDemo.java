package oop.inheritance.fruits;

public class AnanasDemo {
    public static void main(String[] args) {

        String[] vitamins = {"B6", "C", "D"};

        Ananas ananas = new Ananas(vitamins,10, 20);
        System.out.println(ananas);
    }
}

/*

Ananas{fruit=Fruit{vitamins=[B6, C, D], sugar=10}, cellulose=20}
Ananas{Fruit{vitamins=[B6, C, D], sugar=10}cellulose=20}

 */
