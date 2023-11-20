package conditions;

public class ConditionOperationExample {

      /*
    Написать программу, которая запрашивает у пользователя
    три целых числа и выводит на консоль наибольшее из них.

    PS: перед решением этой задачи распишите на бумаге
    или в комментариях все возможные варианты (комбинации).

    Нельзя пользоваться классом Math.

     */

    public static void main(String[] args) {
        /*
        1) "подключить" необходимые классы
        2) запросить у пользователя три числа
        3) отправить эти три числа на сравнение и получить результат
        4) проинформировать пользователя о результате
        */

        UserInput ui = new UserInput();
        ThreeNumbersCompare numbersCompare = new ThreeNumbersCompare();

        System.out.println("Please enter first number: ");
        int first = ui.userIntegerInput();
        System.out.println("Please enter second number: ");
        int second = ui.userIntegerInput();
        System.out.println("Please enter third number: ");
        int third = ui.userIntegerInput();

        int resultCompare = numbersCompare.compare(first,second,third);

        System.out.println("Version 1. Max number is: " + resultCompare);

        int resultCompare2 = numbersCompare.compareTwoNumbers(first, numbersCompare.compareTwoNumbers(second, third));

        System.out.println("Version 2. Max number is: " + resultCompare2);

    }


}
