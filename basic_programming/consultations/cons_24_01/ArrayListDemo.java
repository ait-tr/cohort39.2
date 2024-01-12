

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            list.add(i);
            if (i % 1000000 == 0) {
                System.out.println(i);
            }
        }
    }
}
