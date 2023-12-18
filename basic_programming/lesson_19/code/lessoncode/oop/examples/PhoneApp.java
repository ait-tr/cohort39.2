package oop.examples;

public class PhoneApp {
    public static void main(String[] args) {
        Messenger[] messengers = {new Telegram(), new WhatsApp(), new Viber(), new Signal()};

        Phone phone = new Phone(messengers);

       PhoneUtils utils = new PhoneUtils();

       utils.messengerService(phone.getMessengers());
    }
}
