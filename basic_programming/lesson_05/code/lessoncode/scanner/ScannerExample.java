package scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter text message: ");

        String textMessage = input.nextLine();
        System.out.println("Your text is " + textMessage);

        System.out.println("Please enter integer number: ");
        int number = input.nextInt();

        System.out.println("Your number is " + number);

        System.out.println("Please enter double number: ");
        double numberDouble = input.nextDouble();

        System.out.println("Your number is " + numberDouble);


    }
}
