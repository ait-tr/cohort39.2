package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonStream2 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5);

        List<Integer> square1 = new ArrayList<>();
        for (int i = 0; i < integers.size() ; i++) {
            if (integers.get(i) % 2 == 0) {
                square1.add(integers.get(i) * integers.get(i));
            } else {
                square1.add(integers.get(i));
            }
        }
        System.out.println(square1);

        List<Integer> square2 = integers.stream()
                .map((e) -> (e % 2 == 0) ? e * e : e)
                .toList();

        System.out.println(square2);
    }
}
