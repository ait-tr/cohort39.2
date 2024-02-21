package collections.map.treeMap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3,"text3");
        treeMap.put(2,"text5");
        treeMap.put(1,"text1");

        System.out.println(treeMap);

    }
}
