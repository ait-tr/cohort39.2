import entity.NumbersFrequentWords;
import entity.TextData;
import service.GeneralTextService;
import service.ReceiveTextService;
import service.util.PrintData;

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
