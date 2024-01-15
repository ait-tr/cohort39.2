package treeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        Set<String> ourTreeSetCollection = new TreeSet<>();

        ourTreeSetCollection.add("Alex");
        ourTreeSetCollection.add("Almaz");
        ourTreeSetCollection.add("John");
        ourTreeSetCollection.add("Robert");
        ourTreeSetCollection.add("Andrew");

        System.out.println(ourTreeSetCollection);

        Set<Cat> cats = new TreeSet<>();

        cats.add(new Cat("Murzik"));
        cats.add(new Cat("Barsik"));
        cats.add(new Cat("Murzik2"));

        System.out.println(cats);


    }
}
