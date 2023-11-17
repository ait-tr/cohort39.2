package conditionOperator;

import java.util.Scanner;

public class ConditionOperators2 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 'x' value -> ");
        x = scanner.nextInt();

        boolean isEven = (x % 2 == 0);

        if (isEven) {
            System.out.println("This number is even!");
        } else {
            System.out.println("This number is odd");
        }

    }
}
