package collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        List<String> strings2 = new ArrayList<>();


        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("6");
        strings.add("7");
        strings.add("8");
        strings.add("9");
        strings.add("10");
        strings.add("11");

        strings.trimToSize();
        //strings2.trimToSize();

        System.out.println(strings.get(7));
        strings.remove(7);

        System.out.println(strings);

        System.out.println(strings.size());

        strings.set(7,"111");

        System.out.println(strings);




    }
}
