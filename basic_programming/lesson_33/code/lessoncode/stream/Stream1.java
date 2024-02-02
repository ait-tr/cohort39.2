package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");

        System.out.println(list);

        Stream stream = list.stream();

    }
}
