package string;

import org.w3c.dom.ls.LSOutput;

public class WorkWithString3 {
    public static void main(String[] args) {

        String text = "  Это текст для проверки работы методов типа String  ";

        System.out.println(text);
        System.out.println(" ====== убрать пробелы с начала и конца текста   =====");

        text = text.trim();
        System.out.println(text);

        System.out.println(text.indexOf("метод"));

        String replaceText = text.replaceAll("о","а");

        System.out.println(replaceText);
    }
}
