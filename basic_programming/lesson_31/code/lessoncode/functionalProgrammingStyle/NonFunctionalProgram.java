package functionalProgrammingStyle;

import java.util.ArrayList;
import java.util.List;

public class NonFunctionalProgram {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        changeList(myList);
    }

    static void changeList(List<String> myList) {
        // изменял бы данные в коллекции
    }
}
