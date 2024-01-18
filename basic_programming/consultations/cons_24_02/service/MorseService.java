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

        System.out.println("*********** START DECODING PROCESS ********");
        String dataForDecoding = inputData.request(false);
        String decodingResult = codingProcessService.codingOrDecodingProcess(dataForDecoding,false);
        System.out.println("Our morse code for decoding: " + dataForDecoding);
        System.out.println("Our text message: " + decodingResult);


    }
}
