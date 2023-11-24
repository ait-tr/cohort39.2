package homework2;

public class Task3 {
    /*
    Задача 3.
Дано трехзначное число (произвольное).
Создать три переменные в которые с помощью математических действий
присвоить цифры этого числа
Вывести на экран все переменные (не напечатать цифры, а именно
получить значения переменных).

Пример: 345
Вывод в консоль: Число 345 -> 3, 4, 5
     */
    public static void main(String[] args) {
        int number = 345;

        int digit1 = number % 10;

        int digit2 = number % 100 / 10;

        int digit3 = number / 100;

        System.out.println(digit3 + ", " + digit2 + ", " + digit1);


        String numberStr = String.valueOf(number);

        //System.out.println(numberStr);


        System.out.println("Третья цифра числа: " + numberStr.charAt(0));
        System.out.println("Вторая цифра числа: " + numberStr.charAt(1));
        System.out.println("Первая цифра числа: " + numberStr.charAt(2));



    }
}
