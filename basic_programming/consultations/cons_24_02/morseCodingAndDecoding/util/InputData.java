package morseCodingAndDecoding.util;

import morseCodingAndDecoding2.util.InputDataForCoding;

public class InputData {

    morseCodingAndDecoding2.util.InputDataForCoding codingInput = new InputDataForCoding();

    public String request(boolean isCoding){

       return isCoding ? codingInput.responseText() : codingInput.responseMorse();
    }

}
