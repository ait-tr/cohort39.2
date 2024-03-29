package collections.map.mapKeyCollision;

import java.util.HashMap;
import java.util.Map;

public class ChangeKeyValueMapExample {
    public static void main(String[] args) {
        Map<PersonForCat, Cat> personCatMap = new HashMap<>();

        personCatMap.put(new PersonForCat("Petya"), new Cat("Barsik"));

        PersonForCat person = new PersonForCat("Vasja");
        Cat cat = new Cat("Murzik");

        System.out.println("Person Vasja hashcode = " + person.hashCode());

        personCatMap.put(person,cat);

        System.out.println(personCatMap);

        System.out.println("===============");

        person.name = "Ruslan";
        System.out.println(personCatMap);

        Cat catFromCollection = personCatMap.get(person);

        System.out.println(catFromCollection);

        System.out.println("Ruslan (old Vasja) hashcode = " + person.hashCode());

        PersonForCat vasjaNew = new PersonForCat("Vasja");
        System.out.println("New Vasja hashcode = " + vasjaNew.hashCode());

        catFromCollection = personCatMap.get(vasjaNew);

        System.out.println(catFromCollection);


    }
}
