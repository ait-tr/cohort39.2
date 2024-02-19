import java.util.*;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Clara", "Alex", "Boris","Zeman", "Robert", "John");
        List<String> result = names.stream()
                .sorted((str1, str2) -> str1.length() - str2.length())
                .toList();

        System.out.println(result);

        result = names.stream()
                .sorted((str1, str2) -> Character.compare(str2.charAt(str2.length() - 1), str1.charAt(str1.length() - 1)))
                .toList();

        System.out.println(result);

        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        List<Integer> squares = integers.stream()
                .map(n -> n * n)
                .toList();

        System.out.println(squares);


        List<Integer> result2 = integers.stream()
                .filter(n -> n > 3)
                .toList();

        System.out.println(result2);


        Optional<Integer> findFirst = integers.stream()
                .filter(n -> n > 3)
                .findFirst();

        findFirst.ifPresent(System.out::println);



        List<String> words = Arrays.asList("Java", "Stream", "API");

        List<Integer> lengthWords = words.stream()
                .map(word -> word.length())
                .toList();

        System.out.println(lengthWords);


        Set<Integer> numbers = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(evenNumbers);

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 15);
        map.put("B", 21);
        map.put("C", 28);
        map.put("D", 41);
        map.put("E", 44);
        map.put("F", 51);
        map.put("G", 62);
        map.put("H", 98);


        map.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 == 0)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));



    }
}
