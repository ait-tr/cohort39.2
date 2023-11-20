package loopWhile;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        /*
        попросить у пользователя ввести два целых числа
        вычислить их сумму и напечатать

        повторять до тех пор, пока сумма меньше 100
         */

        int x;
        int y;

        Scanner scanner = new Scanner(System.in);

        boolean condition = true;

        while (condition) {
            System.out.println("Please enter two integer numbers!");
            System.out.println("Please enter first number: ");
            x = scanner.nextInt();
            System.out.println("Please enter second number: ");
            y = scanner.nextInt();

            System.out.println("Add result = " + (x + y));

            if ((x + y) > 100) condition = false;


        }

        System.out.println("Finish loop while!");

    }
}
