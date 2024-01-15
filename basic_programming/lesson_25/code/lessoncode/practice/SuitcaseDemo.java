package practice;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class SuitcaseDemo {
    public static void main(String[] args) {
       CombinedComparator combinedComparator = new CombinedComparator();

        // Создаем и заполняем TreeSet
        TreeSet<Suitcase> suitcases = new TreeSet<>(combinedComparator.getCombined());
        suitcases.add(new Suitcase("PLASTIC", "L", "Red"));
        suitcases.add(new Suitcase("FABRIC", "M", "Blue"));
        suitcases.add(new Suitcase("FABRIC", "L", "Green"));

        // Выводим содержимое TreeSet
        System.out.println("TreeSet contents:");
        for (Suitcase suitcase : suitcases) {
            System.out.println(suitcase);
        }

        // Создаем и заполняем LinkedList
        LinkedList<Suitcase> suitcaseLinkedList = new LinkedList<>();
        suitcaseLinkedList.add(new Suitcase("PLASTIC", "XL", "Green"));
        suitcaseLinkedList.add(new Suitcase("FABRIC", "L", "Black"));

        // Сортируем и выводим содержимое LinkedList
        suitcaseLinkedList.sort(combinedComparator.getCombined());
        System.out.println("\nLinkedList contents after sorting:");
        for (Suitcase suitcase : suitcaseLinkedList) {
            System.out.println(suitcase);
        }
    }
}
