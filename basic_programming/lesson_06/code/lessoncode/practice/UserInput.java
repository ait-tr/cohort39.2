package practice;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);
    public int userInputInt(){
        int input = scanner.nextInt();
        return input;
    }

    public double userInputDouble(){
        double input = scanner.nextDouble();
        return input;
    }
    public String userInputText(){
        String input = scanner.nextLine();
        return input;
    }
}
