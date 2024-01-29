package functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSortSpecialSolutionContinue {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("DD");
        myList.add("FFF");
        myList.add("AAA");
        myList.add("CC");
        myList.add("E");
        myList.add("BBBBBBB");
        System.out.println(myList);



        // Step 3

//        Comparator<String> myComparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };


//        //Step 4
//
//        Comparator<String> comparator = (o1,  o2) -> {return o1.length() - o2.length();};


// Step 5



        Collections.sort(myList, (o1, o2) -> {return o1.length() - o2.length();});
        System.out.println(myList);
    }
}
