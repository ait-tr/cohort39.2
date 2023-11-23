package lessoncode2.userInput;

import java.util.Scanner;

public class UserInput {

    public int userInterfaceInputInt(String message){
        System.out.println(message);
        int userInput = userInputInt();
        return userInput;
    }

    public double userInterfaceInputDouble(String message){
        System.out.println(message);
        return userInputDouble();
    }

    public String userInterfaceInputText(String message){
        System.out.println(message);
        return userInputText();
    }

    private int userInputInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private double userInputDouble(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private String userInputText(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
