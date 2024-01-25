package textApp;

import textApp.entity.NumbersFrequentWords;
import textApp.entity.TextData;
import textApp.service.GeneralTextService;
import textApp.service.ReceiveTextService;
import textApp.service.util.PrintData;

public class TextApp {
    public static void main(String[] args) {

        TextData textData = new TextData();
        ReceiveTextService receiveTextService = new ReceiveTextService(textData);
        GeneralTextService generalTextService = new GeneralTextService(textData);
        PrintData printData = new PrintData();

        receiveTextService.receive();
        generalTextService.splitText();
        generalTextService.countingNumberRepetitions();
        NumbersFrequentWords numbersFrequentWords = generalTextService.findFrequentWords();
        printData.printTextData(textData,numbersFrequentWords);
    }
}
