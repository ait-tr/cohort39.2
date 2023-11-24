package homework5;

import java.util.Scanner;

public class Task2 {
    /*
    Введите 2 слова, используйте сканер.
Получить слово, состоящее из первой половины первого слова и второй половины второго слова.
Если количество букв в слове - нечетное, то среднюю букву в слове не учитывать.
Распечатать на консоль.

     */

    public static void main(String[] args) {
        UserWordInput ui = new UserWordInput();

        String word1 = ui.userWordInput("Please enter first word:");
        String word2 = ui.userWordInput("Please enter second word:");

        int word1length = word1.length()/2 ;
        String firstPart = word1.substring(0,word1length);

        int word2length = word2.length()/2 + word2.length() % 2;
        String secondPart = word2.substring(word2length);

        String finalWord = firstPart + secondPart;

        System.out.println(finalWord);


    }
}
