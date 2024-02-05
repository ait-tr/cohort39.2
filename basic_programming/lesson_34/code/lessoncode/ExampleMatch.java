import java.util.Arrays;
import java.util.List;

public class ExampleMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0,-2,-5,-7,10);
        /*
        ответить на вопрос: все ли четные числа - положительные?
         */

        boolean allPositive = numbers.stream()
                .filter(number -> number % 2 == 0)
                .allMatch(number -> number >= 0);

        System.out.println("Все четные числа - положительные? " + allPositive);

    }
}
