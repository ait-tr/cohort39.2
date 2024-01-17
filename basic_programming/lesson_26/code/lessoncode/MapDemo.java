import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> strings = new TreeMap<>();

        strings.put("1","AAA");
        strings.put("2",null);
        strings.put("3","CCC");
        //strings.put(null,"DDD");
        strings.put("4",null);
        //strings.put(null,"EEE");

        System.out.println(strings);

    }
}
