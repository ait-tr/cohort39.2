package morseCodingAndDecoding.util;


public class InputData {

    InputDataForCoding codingInput = new InputDataForCoding();

    public String request(boolean isCoding){

       return isCoding ? codingInput.responseText() : codingInput.responseMorse();
    }

}
