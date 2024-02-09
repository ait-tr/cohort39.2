package examples;

import lotto.service.UserInput;

public class Example1WithTryCatch {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();


        int x = userInput.uiInt("Введите первое число:");
        int y = userInput.uiInt("Введите второе число:");


        try {
            System.out.println("Результат деления: " + divide(x, y));
        } catch (ArithmeticException exception) {
            System.out.println("произошла ошибка - " + exception.getMessage());
            System.out.println("ошибка деления");
        }

        System.out.println("программа завершила свою работу нормально");

    }

    static double divide(int x, int y) {
        double result = x / y;
        return result;
    }
}
