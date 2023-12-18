package oop.examples;

public class PhoneUtils {

    public void messengerService(Messenger[] messengers) {
        for (int i = 0; i < messengers.length; i++) {
            messengers[i].getMessage();
            messengers[i].sendMessage();
        }
    }
}
