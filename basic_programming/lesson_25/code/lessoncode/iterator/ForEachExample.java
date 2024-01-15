package iterator;

import java.util.List;
import java.util.TreeSet;

public class ForEachExample {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();

        strings.add("AAA");
        strings.add("GGG");
        strings.add("RRR");
        strings.add("EEE");
        strings.add("WWW");
        strings.add("AAA");
        strings.add("MMM");
        strings.add("TTT");
        strings.add("SSS");
        strings.add("FFF");
        strings.add("HHH");
        strings.add("CCC");

        System.out.println(strings);

        for (String tempVar : strings){
            System.out.println(tempVar);
            if (tempVar.equals("HHH")) {strings.remove(tempVar);}
        }

        System.out.println(strings);
    }
}
