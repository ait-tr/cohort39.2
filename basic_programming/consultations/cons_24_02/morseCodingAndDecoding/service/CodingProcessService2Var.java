package morseCodingAndDecoding.service;

import morseCodingAndDecoding2.entity.InitialMorseTable;

import java.util.Arrays;


public class CodingProcessService2Var {

    private final InitialMorseTable initialMorseTable = new InitialMorseTable();

    public String codingOrDecodingProcess(String data, boolean isCoding) {
        return isCoding ? coding(data) : decoding(data);
    }

    private String coding(String data) {
        StringBuilder codingResult = new StringBuilder();
        data = data.toUpperCase();
        for (char character : data.toCharArray()) {
            if (character == ' ') {
                codingResult.append("  ");  // Двойной пробел для разделения слов
            } else {
                String morse = initialMorseTable.getTextToMorse().getOrDefault(String.valueOf(character), "");
                codingResult.append(morse).append(" "); // Одинарный пробел для разделения символов
            }
        }
        return codingResult.toString().trim();
    }

    private String decoding(String data) {
        StringBuilder decodingResult = new StringBuilder();
        boolean previousWasSpace = false; // Флаг для отслеживания последовательных пробелов
        String[] splittedData = data.split(" ");

        System.out.println(Arrays.toString(splittedData));

        for (String morseCode : splittedData) {
            if (morseCode.isEmpty()) {
                if (previousWasSpace) {
                    decodingResult.append(" "); // Добавление пробела между словами
                    previousWasSpace = false;
                } else {
                    previousWasSpace = true;
                }
            } else {
                if (previousWasSpace) {
                    System.out.println("");
                    decodingResult.append(" "); // Добавление пробела между словами, если предыдущий символ был пробелом
                }
                String text = initialMorseTable.getMorseToText().getOrDefault(morseCode, "");
                decodingResult.append(text);
                previousWasSpace = false;
            }
        }

        return decodingResult.toString();
    }

}
