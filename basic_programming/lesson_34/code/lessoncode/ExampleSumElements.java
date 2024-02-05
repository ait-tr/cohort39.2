import java.util.Arrays;
import java.util.List;

public class ExampleSumElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        int totalSumElements = 0;

        for (Integer i : list) {
            if (i % 2 == 0) {
                totalSumElements = totalSumElements + i;
            }
        }

        System.out.println("Сумма всех четных элементов в коллекции: " + totalSumElements);

        // functional way

        int totalSumElements2 = list.stream()
                .filter(p -> p % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        // илим другой вариант

        totalSumElements2 = list.stream()
                .filter(p -> p % 2 == 0)
                .reduce((acc,param) -> acc + param)
                .orElse(0);

        System.out.println("Сумма всех четных элементов в коллекции: " + totalSumElements2);

        // functional way with method reference

        int totalSumElements3 = list.stream()
                .filter(p -> p % 2 == 0)
                .reduce(Integer::sum)
                .orElse(0);

        System.out.println("Сумма всех четных элементов в коллекции: " + totalSumElements3);


    }
}
