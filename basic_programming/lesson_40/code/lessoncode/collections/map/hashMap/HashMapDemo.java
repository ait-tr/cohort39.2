package collections.map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "text1");
        System.out.println(myMap);

        myMap.put(1, "newText");
        System.out.println(myMap);
    }
}
