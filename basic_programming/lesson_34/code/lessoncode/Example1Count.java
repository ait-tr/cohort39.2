import java.util.Arrays;
import java.util.List;

public class Example1Count {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        int count = 0;

        for (Integer i : list){
            if (i % 2 == 0) {
                count++;
            }
        }

        System.out.println("Количество четных элементов в коллекции: " + count);

        // функциональный стиль

        long count2 = list.stream()
                .filter(e -> e % 2 == 0)
                .count();

        System.out.println("Количество четных элементов в коллекции: " + count2);

    }
}
