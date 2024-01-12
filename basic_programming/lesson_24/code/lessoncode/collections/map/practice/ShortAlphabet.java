package collections.map.practice;

import java.util.HashMap;

public class ShortAlphabet {
    public static void main(String[] args) {
        /*
        Создать коллекцию HashMap где в качестве ключа - буква, значение - слово на эту букву.
        Добавить 10 элементов и проверить содержимое коллекции
         */

        HashMap<String,String > alphabet = new HashMap<>();

        alphabet.put("A","Apple");
        alphabet.put("B","Bus");
        alphabet.put("C","Cat");
        alphabet.put("D","Dog");
        alphabet.put("E","Earth");
        alphabet.put("F","Fox");
        alphabet.put("G","Giraffe");
        alphabet.put("H","Hole");
        alphabet.put("I","Iron");
        alphabet.put("J","Jack");

        System.out.println(alphabet);

        System.out.println(alphabet.get("F"));


    }
}
