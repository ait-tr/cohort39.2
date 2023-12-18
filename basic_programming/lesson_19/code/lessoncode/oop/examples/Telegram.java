package oop.examples;

public class Telegram implements Messenger{
    @Override
    public void getMessage() {
        System.out.println("Telegram message receiving");
    }

    @Override
    public void sendMessage() {
        System.out.println("Telegram message sending");
    }
}
