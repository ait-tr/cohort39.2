package homework5;

import java.util.Scanner;

public class UserWordInput {

    public String userWordInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();

    }
}
