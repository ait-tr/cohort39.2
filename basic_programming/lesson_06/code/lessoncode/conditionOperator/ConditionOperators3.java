package conditionOperator;

import java.util.Scanner;

public class ConditionOperators3 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 'x' value -> ");
        x = scanner.nextInt();

      // определить входит ли число
        // в диапазон от 0 до 100 или
        // в диапазон от 100 до 200 или
        // ни в один из них

        if (x >= 0) {
            if (x <= 100) {
                System.out.println("Диапазон 1");
            } else if (x <= 200) {
                System.out.println("Диапазон 2");
            } else System.out.println("Out of range!");
        } else System.out.println("Out of range! (negative) ");



        if (x >= 0 && x <= 100 ) {
            System.out.println("Диапазон 1");
        } else  if (x > 100 && x <= 200 ) {
            System.out.println("Диапазон 2");
        } else {
            System.out.println("X is out of range");
        }

        System.out.println((true && true) && (true || false));

    }
}
