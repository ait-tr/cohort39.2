package streamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5);

        System.out.println(numbers);

        // создать коллекцию из квадратов значений

        // oldSchool
        List<Integer> squareList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            squareList.add(numbers.get(i) * numbers.get(i));
        }

        // stream
        List<Integer> square = numbers.stream()
                .map(x -> x * x)
                .toList();

        System.out.println(square);

        // ------------------ task 2 ----------------

        List<String> word = Arrays.asList("Java", "Collections", "Stream", "Array", "System");

        List<String> result = word.stream()
                .filter(s -> s.startsWith("S"))
                .toList();

        System.out.println(result);



    }
}
