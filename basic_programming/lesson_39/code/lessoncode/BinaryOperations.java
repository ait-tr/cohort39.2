public class BinaryOperations {
    public static void main(String[] args) {

        System.out.println( true && true);
        System.out.println( true && false);
        System.out.println( true || true);
        System.out.println( true || false);
        System.out.println( false || false);

        System.out.println( true & true);

        int number = 10;

        System.out.println((number < 0) & (number < 100));


        System.out.println("================");

        String[] strings = new String[2];

        if ((strings[0] != null) && (strings[0].length() < 10)) {
            System.out.println("Ok");
        }

        // оператор &

        System.out.println("БИТОВЫЕ ОПЕРАЦИИ");


        System.out.println("Число: " + 5 + " в двоичной системе вырается так: " + Integer.toBinaryString(5));
        System.out.println("Число: " + 3 + " в двоичной системе вырается так: " + Integer.toBinaryString(3));

        System.out.println();

        System.out.println("Число которое получается в результате битовой операции И(AND) 5 & 3 будет: " + Integer.toBinaryString( 5 & 3) + " что в десятичной системе равно " + (5 & 3));

        System.out.println("Число которое получается в результате битовой операции ИЛИ(OR) 5 | 3 будет: " + Integer.toBinaryString( 5 | 3)+ " что в десятичной системе равно " + (5 | 3));

        /*
        число 5 -> 101
        число 3 -> 001

        &

        101
        011
        ----
        001 -> 1


        |
        101
        011
        ---
        111 -> 7
         */

    }
}
