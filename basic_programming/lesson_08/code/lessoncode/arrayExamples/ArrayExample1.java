package arrayExamples;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {

        int[] arrayInt = new int[3];

        arrayInt[0] = 6;
        arrayInt[1] = 9;
        arrayInt[2] = 6;

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(arrayInt[0] + arrayInt[1] + arrayInt[2]);

        System.out.println(arrayInt[0] == arrayInt[1]);
        System.out.println(arrayInt[0] == arrayInt[2]);

        arrayInt[2] = arrayInt[0] + arrayInt[1];

        System.out.println(Arrays.toString(arrayInt));


    }
}
