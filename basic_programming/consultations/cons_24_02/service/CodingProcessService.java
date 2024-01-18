package service;

import entity.InitialMorseTable;

import java.util.LinkedList;
import java.util.List;

public class CodingProcessService {

    InitialMorseTable initialMorseTable = new InitialMorseTable();

    public String codingOrDecodingProcess(String dataForCodingProcess, boolean isCoding){
       String codingResult = "";
        if (isCoding){
            codingResult = coding(dataForCodingProcess);
        }

        return codingResult;
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
