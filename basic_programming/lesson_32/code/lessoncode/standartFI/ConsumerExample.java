package standartFI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<List<Integer>> modify = list ->
                list.replaceAll(integer -> integer * integer);
        Consumer<List<Integer>> displayList = list -> list.forEach(a-> System.out.print(a + " "));


        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(5);

        modify.accept(list);

        displayList.accept(list);
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }


    }
}
