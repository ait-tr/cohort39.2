package string;

public class WorkWithString {
    public static void main(String[] args) {

        String str1 = "       ";
        String text = "Это текст для проверки работы методов типа String";
        String text1 = "";

        System.out.println(str1.length());

        int myTextLength = text.length();

        System.out.println(" ====== вычисление длины строки =====");

        System.out.println(myTextLength);

        System.out.println(" ====== проверка строки на наличие любых символов  =====");

        boolean isMySrtEmpty = str1.isEmpty();
        System.out.println(isMySrtEmpty);

        boolean isMyText1Empty = text1.isEmpty();
        System.out.println(isMyText1Empty);

        System.out.println(" ====== проверка строки на наличие любых символов кроме пробела  =====");

        boolean isMySrtBlank = str1.isBlank();
        System.out.println(isMySrtBlank);

        boolean isMyText1Blank = text1.isBlank();
        System.out.println(isMyText1Blank);



    }
}
