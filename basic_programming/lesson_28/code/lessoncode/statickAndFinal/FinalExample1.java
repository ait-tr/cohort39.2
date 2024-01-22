package statickAndFinal;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class FinalExample1 {

        private final static String SOMESTRING = "My some string";

        private static void print(final double data) {
            final String str;

            str = " final String";
            System.out.println(str);

            // str = "New string"; --- НЕ РАБОТАЕТ!!!!

            System.out.println(data);

            // data = 1000000; --- не работает!!! так как переменная была объявлена как final!!!

            System.out.println(SOMESTRING);
        }

    public static void main(String[] args) {
        print(333);

        List<String> myStack = new LinkedList<>();
        myStack.add("A");
        myStack.add("B");
        myStack.add("C");

        String finalString = "My final string";

        FinalStack finalStack = new FinalStack(myStack, finalString);

        System.out.println(finalStack.stringStack);

        finalStack.stringStack.add("D");

        System.out.println(finalStack.stringStack);

        finalStack.stringStack.add("2");
        finalStack.stringStack.add("3");
        finalStack.stringStack.add("4");
        finalStack.stringStack.add("5");
        finalStack.stringStack.add("6");
        finalStack.stringStack.add("7");
        finalStack.stringStack.add("8");
        finalStack.stringStack.add("9");
        finalStack.stringStack.add(0, "10");
        finalStack.stringStack.remove(2);
        finalStack.stringStack.add(2,"2B");

        System.out.println(finalStack.stringStack);

        System.out.println(finalStack.finalString);

        // finalStack.finalString = "NEW INFO";--- не работает!!! так как переменная была объявлена как final!!!


        List<String> myStack2 = new LinkedList<>();

       // finalStack.stringStack = myStack2;

        final CarFinal myCar = new CarFinal("Mercedes");

        //myCar.model = "Mercedes";

        System.out.println(myCar.model);

        myCar.model = "Mercedes AMG";

        System.out.println(myCar.model);

        // myCar = new CarFinal(); - final для объекта означает, что не может быть изменена ссылка на объект,
        // но содержимое объекта может быть изменена

    }

}
