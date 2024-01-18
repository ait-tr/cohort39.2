package service;


import util.InputData;

public class MorseService {
    InputData inputData = new InputData();
    CodingProcessService codingProcessService = new CodingProcessService();

    public void codingProcess(){


        System.out.println("*********** START CODING PROCESS ********");
        String dataForCoding = inputData.request(true);
        String codingResult = codingProcessService.codingOrDecodingProcess(dataForCoding,true);
        System.out.println("Our text for coding: " + dataForCoding);
        System.out.println("Our morse code: " + codingResult);

    }
}
