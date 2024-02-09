package examples;

import lotto.service.UserInput;

public class Example1 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();


        int x = userInput.uiInt("Введите первое число:");
        int y = userInput.uiInt("Введите второе число:");

        if (y != 0){
        System.out.println("Результат деления: " + divide(x,y));
        }

    }

    static double divide(int x, int y) {
        double result = x / y;
        return result;
    }
}
