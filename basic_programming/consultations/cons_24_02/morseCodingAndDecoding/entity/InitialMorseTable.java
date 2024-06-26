package morseCodingAndDecoding.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InitialMorseTable {
    
    private Map<String, String> textToMorse = new HashMap<>();
    private Map<String, String> morseToText = new HashMap<>();

    public InitialMorseTable() {
        fillTextToMorse();
        fillMorseToText();
    }
    public Map<String, String> getTextToMorse() {
        return textToMorse;
    }

    public Map<String, String> getMorseToText() {
        return morseToText;
    }

    private void fillTextToMorse() {
        textToMorse.put("А", ".−");
        textToMorse.put("Б", "−...");
        textToMorse.put("В", ".−−");
        textToMorse.put("Г", "−−.");
        textToMorse.put("Д", "−..");
        textToMorse.put("Е", ".");
        textToMorse.put("Ё", "..−..");
        textToMorse.put("Ж", "...−");
        textToMorse.put("З", "−−..");
        textToMorse.put("И", "−.−−");
        textToMorse.put("Й", ".−−−");
        textToMorse.put("К", "−.−");
        textToMorse.put("Л", ".−..");
        textToMorse.put("М", "−−");
        textToMorse.put("Н", "−.");
        textToMorse.put("О", "−−−");
        textToMorse.put("П", ".−−.");
        textToMorse.put("Р", ".−.");
        textToMorse.put("С", "...");
        textToMorse.put("Т", "−");
        textToMorse.put("У", "..−");
        textToMorse.put("Ф", "..−.");
        textToMorse.put("Х", "....");
        textToMorse.put("Ц", "−.−.");
        textToMorse.put("Ч", "−−−.");
        textToMorse.put("Ш", "−−−−");
        textToMorse.put("Щ", "−−.−");
        textToMorse.put("Э", "−..−");
        textToMorse.put("Ю", "..−−");
        textToMorse.put("Я", ".−.−");
        textToMorse.put("0", "-----");
        textToMorse.put("1", ".----");
        textToMorse.put("2", "..---");
        textToMorse.put("3", "...--");
        textToMorse.put("4", "....-");
        textToMorse.put("5", ".....");
        textToMorse.put("6", "-....");
        textToMorse.put("7", "--...");
        textToMorse.put("8", "---..");
        textToMorse.put("9", "----.");
        textToMorse.put(".", ".-.-.-");
        textToMorse.put(",", "--..--");
        textToMorse.put("?", "..--..");
        textToMorse.put("\'", ".----.");
        textToMorse.put("!", "-.-.--");
        textToMorse.put("/", "-..-.");
        textToMorse.put("(", "-.--.");
        textToMorse.put(")", "-.--.-");
        textToMorse.put("&", ".-...");
        textToMorse.put(":", "---...");
        textToMorse.put(";", "-.-.-.");
        textToMorse.put("=", "-...-");
        textToMorse.put("+", ".-.-.");
        textToMorse.put("-", "-....-");
        textToMorse.put("_", "..--.-");
        textToMorse.put("\"", ".-..-.");
        textToMorse.put("$", "...-..-");
        textToMorse.put("@", ".--.-.");
        textToMorse.put("¿", "..-.-");
        textToMorse.put("¡", "--...-");
        textToMorse.put(" ", " ");
    }

    private void fillMorseToText(){
//        for (Map.Entry<String, String> entry : textToMorse.entrySet()){
//            morseToText.put(entry.getValue(), entry.getKey());
//        }
        // -------- второй вариант ------

        for (String key : textToMorse.keySet()){
            morseToText.put(textToMorse.get(key) , key);
        }
    }
    
}
