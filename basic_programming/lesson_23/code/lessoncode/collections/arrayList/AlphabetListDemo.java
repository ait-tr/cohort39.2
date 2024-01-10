package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AlphabetListDemo {
    public static void main(String[] args) {
        // Создание ArrayList для хранения букв
        ArrayList<String> alphabet = new ArrayList<>();

        // добавить буквы в коллекцию
        for (char letter = 'A'; letter <= 'J'; letter++) {
            alphabet.add(String.valueOf(letter));
        }

        // вывод букв в прямом порядке
        System.out.println("Прямой порядок");
        printList(alphabet);

        System.out.println();

        // вывод букв в обратном порядке
        System.out.println("Обратный порядок");
        for (int i = alphabet.size() - 1; i >= 0; i--) {
            System.out.print(alphabet.get(i) + ", ");
        }

        System.out.println();

        ArrayList<String> reverseAlphabet = alphabet;
        //Collections.reverse(reverseAlphabet);
        reverseList(reverseAlphabet);
        System.out.println("Обратный порядок (вариант 2 с использованием реверса");
        printList(reverseAlphabet);
    }

    private static void printList(ArrayList<String> alphabet) {
        for (int i = 0; i < alphabet.size(); i++) {
            System.out.print(alphabet.get(i) + ", ");
        }
    }

    private static void reverseList(ArrayList<String> alphabet){
        for (int i = 0; i < alphabet.size() / 2; i++) {
            String temp = alphabet.get(i);
            int reverseIndex = alphabet.size() - 1 - i;
            alphabet.set(i, alphabet.get(reverseIndex));
            alphabet.set(reverseIndex, temp);
        }
    }
}
