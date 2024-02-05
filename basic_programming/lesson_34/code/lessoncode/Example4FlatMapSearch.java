import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example4FlatMapSearch {
    public static void main(String[] args) {

        // найти все элементы которые не равны "a"
        String[][] strings = {{"a","b"},{"c","d"},{"e","f"}};

        Arrays.stream(strings)
                .flatMap(subArray -> Arrays.stream(subArray))
                .filter(x -> !x.equals("a"))
                .forEach(x -> System.out.print(x + ", "));

        System.out.println();


        List<String> stringList = Stream.of(strings)
                        .flatMap(e -> Arrays.stream(e))
                        .filter(x -> !x.equals("a"))
                        .toList();

        stringList.forEach(e-> System.out.print(e + ", "));


    }
}
