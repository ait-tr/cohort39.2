package arrayExamples;

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {

      String[] stringArray = new String[4];

      stringArray[0] = "word 1";
      stringArray[1] = "word 2c ";
      stringArray[2] = " word 1 ";
      stringArray[3] = "word 4 ";

        System.out.println(Arrays.toString(stringArray));

        stringArray[2] = stringArray[2].trim();

        System.out.println(Arrays.toString(stringArray));

        System.out.println(stringArray[0] + stringArray[1]);

        System.out.println(stringArray[0].equals(stringArray[1]));

        System.out.println(stringArray[0].equals(stringArray[2]));

    }
}
