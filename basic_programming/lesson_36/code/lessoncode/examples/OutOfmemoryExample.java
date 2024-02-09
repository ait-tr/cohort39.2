package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OutOfmemoryExample {
    public static void main(String[] args) {

        List newList = new ArrayList<>();
        int count = 0;
        
        while (true) {
            newList.add(newStringArray());
            count++;
        }
    }
    
    static String[] newStringArray() {
        String[] newArray = new String[1_000_000];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = "`vsfmbv`s,dmvb`,shbv`,shvb,`sbvh,`msbv,`lsmnvb`,mscvn";
        }
        return newArray;
    }
}
