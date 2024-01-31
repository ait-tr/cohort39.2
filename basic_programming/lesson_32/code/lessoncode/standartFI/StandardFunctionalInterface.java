package standartFI;

import java.util.Scanner;
import java.util.function.*;

public class StandardFunctionalInterface {
    public static void main(String[] args) {

       // ======== PREDICATE ===========

        // "старая полная" форма записи

        Predicate<Integer> isPositiveFullText = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer >= 0) {
                    return true;
                }
                return false;
            }
        };

        Predicate<Integer> isPositive = x -> x >= 0;

        System.out.println(" -5 > 0 ? - " + isPositive.test(-5));


        // ======== Consumer ===========

        Consumer<Integer> printer = x -> {
            System.out.println("This is amount in EUR: ");
            System.out.printf("%d EUR \n", x);
        };

        printer.accept(600);


        // ======== Function ===========

        Function<Integer, String> integerToTextConverter = x -> String.valueOf(x) + " EURO";

        System.out.println(integerToTextConverter.apply(750));


        // ======== SUPPLIER ===========

        Supplier<User> userFactory = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter user name: ");
            String name = scanner.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println(user1);
        System.out.println(user2);

        // ======== UNARY OPERATOR ===========

        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        // ======== BINARY OPERATOR ===========

        BinaryOperator<Integer> multipy = (x,y) -> x * y;

        System.out.println(multipy.apply(5,7));

    }
}
