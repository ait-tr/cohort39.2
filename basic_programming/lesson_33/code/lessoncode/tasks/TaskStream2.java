package tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TaskStream2 {
    /*
- посчитать общее количество слов
- посчитать только не повторяющиеся слова

     */

    public static void main(String[] args) {

        String[][] array = new String[][]{
                {"Hello", "world"}, {"Hello", "Java"}, {"Hello", "student"}, {"Welcome", "to", "Java"}
        };

        List<String> streamArray = Arrays.stream(array)
                .flatMap(innerArray -> Arrays.stream(innerArray))
                .toList();

        System.out.println(streamArray);

        long count =  Arrays.stream(array)
                .flatMap(Arrays::stream)
                .count();

        long count2 =  Arrays.stream(array)
                .flatMap(innerArray -> Arrays.stream(innerArray))
                .distinct()
                .count();





    }
}
