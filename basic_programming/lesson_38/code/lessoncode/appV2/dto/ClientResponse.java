package appV2.dto;

public class ClientResponse <T> {
    private int responseCode;
    // 200 - OK
    // 400 - error

    private T responseInfo;

    private String message;
    // запись данных произведена успешно
    // таких данных в коллекции нет

}


