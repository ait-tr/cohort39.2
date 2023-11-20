package loopWhile;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        boolean condition = true;

        while (condition) {

            System.out.println("Please choose menu number: ");
            System.out.println("1. Monday");
            System.out.println("2. Wednesday");
            System.out.println("3. Friday");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Your choose is Monday");
                    break;
                case 2:
                    System.out.println("Your choose is Wednesday");
                    break;
                case 3:
                    System.out.println("Your choose is Friday");
                    break;
                case 4:
                    System.out.println("Exit ...");
                    condition = false;
                    break;
            }
        }

        System.out.println("Finish loop while!");
    }
}
