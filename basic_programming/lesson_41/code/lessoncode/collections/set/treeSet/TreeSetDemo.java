package collections.set.treeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Element 1");
        treeSet.add("Element 3");
        treeSet.add("Element 5");
        treeSet.add("Element 2");
        treeSet.add("Element 4");
        treeSet.add("Element 1");
        treeSet.add("Element 7");

        System.out.println(treeSet);
    }
}
