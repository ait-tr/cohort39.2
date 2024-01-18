package service;

import entity.InitialMorseTable;

import java.util.LinkedList;
import java.util.List;

public class CodingProcessService {

    InitialMorseTable initialMorseTable = new InitialMorseTable();

    public String codingOrDecodingProcess(String data, boolean isCoding){

        return isCoding ? coding(data) : decoding(data);
    }


    private String coding(String dataForCodingProcess){
        String codingResult = "";
        List<String> dataForCoding  = prepareDataForCoding(dataForCodingProcess,"");
        for (String stringElement : dataForCoding){
            String codingElement = initialMorseTable.getTextToMorse().get(stringElement);
            codingResult = codingResult + codingElement + " ";
        }
        return codingResult;
    }


    private String decoding(String dataForDecodingProcess){
        String decodingResult = "";
        List<String> dataForDecoding = prepareDataForCoding(dataForDecodingProcess, " ");
        for (String stringElement : dataForDecoding) {
            String decodingElement = initialMorseTable.getMorseToText().get(stringElement);
            decodingResult = decodingResult + decodingElement;
        }
        return decodingResult;
    }


    private List<String> prepareDataForCoding(String dataForCodingProcess, String regexFirst){
        List<String> separatedElementFromDataSource = new LinkedList<>();

        dataForCodingProcess = dataForCodingProcess.toUpperCase();
        String[] splittedElement = dataForCodingProcess.split(regexFirst);

        for (int i = 0; i < splittedElement.length; i++) {
            separatedElementFromDataSource.add(splittedElement[i]);
        }
        return separatedElementFromDataSource;
    }

}
