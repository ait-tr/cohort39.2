package oop.examples;

public class WhatsApp implements Messenger{
    @Override
    public void getMessage() {
        System.out.println("WhatsApp message receiving");
    }

    @Override
    public void sendMessage() {
        System.out.println("WhatsApp message sending");
    }
}
