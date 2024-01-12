package collections.map.practice;

import javax.swing.*;
import java.util.HashMap;

public class MapExample2 {
    public static void main(String[] args) {
        int[] arr = {1,7,4,9,12,45,3,9,23,1,7,12,1,7,23};

        /*
        написать метод, который получает на входе массив
        возвращает коллекцию, у которой в качестве ключа - элемент массива, а значение - количество повторений
         */

        HashMap<Integer, Integer> myMap = createHashMapCollection(arr);
        System.out.println(myMap);

    }

    static HashMap<Integer, Integer> createHashMapCollection(int[] arr){
        HashMap<Integer, Integer> ourMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int key = arr[i];

            if (ourMap.get(key) != null) {
                count = ourMap.get(key);
            }

            count++;

            ourMap.put(key, count);
        }

        return ourMap;

    }
}
