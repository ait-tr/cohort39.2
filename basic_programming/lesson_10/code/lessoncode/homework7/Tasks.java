package homework7;

import java.util.Scanner;

public class Tasks {

    /*
    #### Задача 4 (Дополнительная)
- **Цель**: Определить, является ли год високосным.
- **Условия**: Год является високосным, если он делится на 4 без остатка, и либо не делится на 100, либо делится на 400.

---

### Задачи с использованием циклов

#### Задача 1
- **Цель**: Используя цикл for/while, написать программу, выводящую кубы чисел от 1 до n.
- **Пример**: Для числа n = 3, результат должен быть:
    - 1 в кубе = 1
    - 2 в кубе = 8
    - 3 в кубе = 27

#### Задача 2
- **Цель**: С помощью цикла for/while написать программу, выводящую результат умножения числа n на все целые числа от 0 до n.
- **Пример**: Для числа 3, результат будет 0, 3, 6, 9.

---

### Дополнительные задачи на циклы

#### Task 0
- **Цель**: Распечатать 10 строк: "Task1", "Task2", ..., "Task10". Использовать цикл for/while.

#### Task 1
- **Цель**: Распечатать все числа от 1 до 100, делящиеся на 5 без остатка. Использовать цикл do-while.

#### Task 2
- **Цель**: Распечатать только первые 7 чисел от 1 до 100, делящиеся на 5 без остатка. Использовать цикл while.

#### Task 3
- **Цель**: Программа запрашивает у пользователя слово "hello". Если слово введено верно, программа благодарит и завершает работу. В противном случае запрашивает ввести слово снова.
- **Опционально**: Считать количество попыток, требуемых для введения правильного слова. По окончанию вывести это число.

#### Task 4
- **Цель**: Программа просит пользователя ввести произвольное число и выводит сумму его цифр.
- **Пример**: Для числа 567432 результат будет 5+6+7+4+3+2 = 27.

---
     */

    public boolean checkYearLeap(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public void cubes(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("Число " + i + " в кубе = " + (i * i * i));
        }
    }

    public void  multiplicationAllNumbers(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("Число " + n + " умножить на  " + i + " = " + (i * n));
        }
    }

    public void printTaskNumber(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("Task" + i);
        }
    }

    public void divByFive(){
        int i = 1;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }

    public int[] firstSeven(){
        int[] result = new int[7];
        int i = 1;
        int count = 0;
        while (i <= 100 && count < 7) {
            if (i % 5 == 0){
                result[count] = i;
                count++;
            }
            i++;
        }

        return result;
    }


    public void checkWord(){
        Scanner scanner = new Scanner(System.in);
        String word = "";
        int iteration = 0;

        while (!word.equals("hello")) {
            System.out.println("Введите слово 'hello': ");
            word = scanner.nextLine();
            iteration++;
        }

        System.out.println("Вы справились! Количество попыток: " + iteration);
    }

    public int sumOfDigits(int number){
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        /*
        123
        sum = 0 123
        sum = 0 + 3, number = 12
        sum = 3 + 2, number = 1
        sum = 5 + 1 = 6 , number = 1 / 10 = 0
         */

        return sum;
    }


}
