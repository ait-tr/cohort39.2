package collections.dynamicArrayStructure;

import java.util.Arrays;

public class DasExample {
    public static void main(String[] args) {

        DAS das = new DAS();

        int[] ourArray = new int[1];

        ourArray[0] = 1;

        System.out.println(Arrays.toString(ourArray));

        for (int i = 2; i < 10; i++) {
            ourArray = das.addNewElement(ourArray, i);
            System.out.println(Arrays.toString(ourArray));
        }
    }
}
