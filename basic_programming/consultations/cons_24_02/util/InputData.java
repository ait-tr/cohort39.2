package util;

public class InputData {

    InputDataForCoding encodingInput = new InputDataForCoding();

    public String request(boolean isCoding){
        String data="";
       if (isCoding){
           data = encodingInput.response();
       }

       return data;
    }

}
