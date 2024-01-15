import java.util.*;

public class Dictionary {
    public static void main(String[] args) {

        Map<String, Set<String>> dict = new HashMap<>();

        Set<String> firstSet = new HashSet<>();
        firstSet.add("table");
        firstSet.add("desk");


        dict.put("стол", firstSet);

        System.out.println(dict);


    }
}
