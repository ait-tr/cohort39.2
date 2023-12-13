package oop.incapsulation;

import oop.incapsulation.twoLevel.Person;

public class IncapsulationExample {
    public static void main(String[] args) {
        Person person = new Person(1,"Olga", "Smith", "New-York");

//        person.id = 10;
//        person.secondName = "Paterson";

        System.out.println(person.getId());

    }
}
