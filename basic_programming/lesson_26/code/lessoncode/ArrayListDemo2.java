import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();

        strings.add("AAA");
        strings.add("BBB");
        strings.add(null);
        strings.add(null);
        strings.add(null);
        strings.add(null);
        strings.add("CCC");

        System.out.println(strings);

    }
}
