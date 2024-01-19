package hashSetWithIncorrectHashCodeFunction;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<CustomItem> itemSet = new HashSet<>();

        // Добаляем разные элементы
        itemSet.add(new CustomItem("Item1"));
        itemSet.add(new CustomItem("Item2"));
        itemSet.add(new CustomItem("Item3"));

        // Вывод элементов коллекции
        System.out.println(itemSet);

    }
}
