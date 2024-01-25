package service.util;

import entity.NumbersFrequentWords;
import entity.TextData;

import java.util.Map;

public class PrintData {

    public void printTextData(TextData textData, NumbersFrequentWords numbersFrequentWords){
        System.out.println("Исходный текст:");
        System.out.println(textData.getText());

        System.out.println("=============================");
        System.out.println("Количество вхождений каждого слова:");
        System.out.println("------------------------------------");


        Map<String, Integer> wordCounter = textData.getWordsCounter();

        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()){
            System.out.println("Слово: " + entry.getKey() + " встречается " + entry.getValue() + " раз(а)");
        }

        System.out.println();
        System.out.println("=============================");
        System.out.println("Наибольшее количество вхождений слов: " + numbersFrequentWords.getMaxFrequency());
        System.out.println(textData.getMostOftenWords());
        System.out.println("Наименьшее количество вхождений слов: " + numbersFrequentWords.getMinFrequency());
        System.out.println(textData.getLeastWords());
        System.out.println("------------------------------------");

    }
}
