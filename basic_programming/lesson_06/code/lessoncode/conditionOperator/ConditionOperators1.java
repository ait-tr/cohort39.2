package conditionOperator;

import java.util.Scanner;

public class ConditionOperators1 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 'x' value -> ");
        x = scanner.nextInt();

        if (x > 0) {
            System.out.println("X > 0");
        } else if (x < 0){
            System.out.println("X < 0");
        } else {
            System.out.println("X = 0 !!!!");
        }
    }
}
