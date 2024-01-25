package entity;

import java.util.*;

public class TextData {

    private String text;

    private ArrayList<String> allTextWords;

    private Map<String, Integer> wordsCounter;

    private ArrayList<String> mostOftenWords;

    private ArrayList<String> leastWords;

    public TextData() {
        this.text = "";
        this.allTextWords = new ArrayList<>();
        this.wordsCounter = new HashMap<>();
        this.mostOftenWords = new ArrayList<>();
        this.leastWords = new ArrayList<>();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getAllTextWords() {
        return allTextWords;
    }


    public Map<String, Integer> getWordsCounter() {
        return wordsCounter;
    }

    public ArrayList<String> getMostOftenWords() {
        return mostOftenWords;
    }

    public ArrayList<String> getLeastWords() {
        return leastWords;
    }

    @Override
    public String toString() {
        return "TextData{" +
                "text='" + text + '\'' +
                ", allTextWords=" + allTextWords +
                ", wordsCounter=" + wordsCounter +
                ", mostOftenWords=" + mostOftenWords +
                ", leastWords=" + leastWords +
                '}';
    }
}
