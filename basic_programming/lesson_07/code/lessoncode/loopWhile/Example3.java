package loopWhile;

import practice.UserInput;

import java.util.Objects;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        boolean condition = true;
        UserInput input = new UserInput();
        Cat cat;

        while (condition) {
            System.out.println("Please enter new cat name");
            String catName = input.userInputText();
            System.out.println("Please enter new cat breed");
            String catBreed = input.userInputText();

            if ((catName.equals(""))&&(catBreed.equals(""))) {
                condition = false;
            } else {
                cat = new Cat(catName,catBreed);
                System.out.println(cat);
            }
        }
    }
}
