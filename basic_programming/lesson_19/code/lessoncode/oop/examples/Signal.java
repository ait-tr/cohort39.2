package oop.examples;

public class Signal implements Messenger{
    @Override
    public void getMessage() {
        System.out.println("Signal message receiving");
    }

    @Override
    public void sendMessage() {
        System.out.println("Signal message sending");
    }
}
