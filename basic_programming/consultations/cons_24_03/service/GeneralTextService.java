package service;

import entity.NumbersFrequentWords;
import entity.TextData;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneralTextService {

    private final TextData textData;

    public GeneralTextService(TextData textData) {
        this.textData = textData;
    }

    public void splitText(){
        String[] strings = textData.getText().trim().split(" ");
        for (String currentWord : strings){
            if (!currentWord.isEmpty()){
                List<String> wordsList = textData.getAllTextWords();
                wordsList.add(currentWord);
            }
        }
    }
    
    public void countingNumberRepetitions(){
        List<String> wordsList = textData.getAllTextWords();
        Map<String, Integer> wordsCounter = textData.getWordsCounter();
        
        for (String word : wordsList) {
            word = word.toLowerCase();
            wordsCounter.put(word, wordsCounter.getOrDefault(word,0) + 1);
        }
    }

    public NumbersFrequentWords findFrequentWords(){
        Map<String, Integer> wordsCounter = textData.getWordsCounter();
        List<String> mostFrequentWords = textData.getMostOftenWords();
        List<String> leastFrequentWords = textData.getLeastWords();

        int maxFrequency = Collections.max(wordsCounter.values());
        int minFrequency = Collections.min(wordsCounter.values());

        for (Map.Entry<String, Integer> entry : wordsCounter.entrySet()){
            if (entry.getValue() == maxFrequency) {
                mostFrequentWords.add(entry.getKey());
            }
            if (entry.getValue() == minFrequency) {
                leastFrequentWords.add(entry.getKey());
            }
        }

        return new NumbersFrequentWords(maxFrequency, minFrequency);

    }

}
