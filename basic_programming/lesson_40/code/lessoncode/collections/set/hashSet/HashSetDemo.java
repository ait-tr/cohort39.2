package collections.set.hashSet;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Element 1");
        hashSet.add("Element 3");
        hashSet.add("Element 5");
        hashSet.add("Element 2");
        hashSet.add("Element 4");
        hashSet.add("Element 1");
        hashSet.add("Element 7");

        System.out.println(hashSet);
    }
}
