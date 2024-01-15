package practice.flat;

import java.util.TreeSet;

public class FlatDemo {
    public static void main(String[] args) {
        TreeSet<Flat> flats = new TreeSet<>();
        flats.add(new Flat(80.0, 2));
        flats.add(new Flat(120.0, 3));
        flats.add(new Flat(90.0, 2));
        flats.add(new Flat(110.0, 3));

        System.out.println(flats);
    }
}
