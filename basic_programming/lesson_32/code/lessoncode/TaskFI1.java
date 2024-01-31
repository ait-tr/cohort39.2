public class TaskFI1 {
    public static void main(String[] args) {
        /*
        1. Напишите функциональный интерфейс для преобразования строки в верхний регистр.

         */

        MyToUpperCase myText = text -> text.toUpperCase();
            System.out.println(myText.myToUpperCase("текст маленькими буквами"));


    }
}

interface MyToUpperCase{
    String myToUpperCase(String text);
}
