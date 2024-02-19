package collections.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(3,"text3");
        linkedHashMap.put(2,"text5");
        linkedHashMap.put(1,"text1");

        System.out.println(linkedHashMap);

    }
}
