import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello!");

        //------

         //list.add(123);

        for (Object str : list) {

            String text = (String) str;
            System.out.println(text);
        }
    }
}
