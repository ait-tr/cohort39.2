package service;

import entity.TextData;
import service.util.ReadText;

public class ReceiveTextService {

    private final TextData textData;

    private ReadText readText = new ReadText();

    public ReceiveTextService(TextData textData) {
        this.textData = textData;
    }

    public void receive(){

        String workingText = readText.inputText();

        textData.setText(workingText);
    }

}
