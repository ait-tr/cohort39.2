package immutable;

import java.util.ArrayList;
import java.util.List;

class ImmutableListException {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of("A"));
        System.out.println(strings);
        strings.add("B");
        System.out.println(strings);



        List<String> stringsImmutable = List.of("A");
        System.out.println(stringsImmutable);
        stringsImmutable.add("B");
        System.out.println(stringsImmutable);
    }
}