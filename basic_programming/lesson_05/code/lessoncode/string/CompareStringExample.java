package string;

public class CompareStringExample {
    public static void main(String[] args) {

        String text1 = "This is string text example";

        String text2 = "This is string text example";

        String text3 = new String("This is string text example");

        System.out.println("======= сравнение через знак '=='  ========");

        System.out.println(text1 == text2);

        System.out.println(text1 == text3);

        System.out.println("======= сравнение через equals ========");

        System.out.println(text1.equals(text2));

        System.out.println(text1.equals(text3));


    }
}
