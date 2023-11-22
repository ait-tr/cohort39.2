package arrayExamples;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample6 {
    public static void main(String[] args) {

      Random random = new Random();

      int arraySize = 15; // допустим что это значение мы получили от пользователя

      int[] intArray = new int[arraySize];

      for (int i = 0; i < intArray.length; i++) {
        intArray[i] = random.nextInt(100);
      }

      System.out.println(Arrays.toString(intArray));

      int min = intArray[0];
      int indexMin = 0;

      for (int i = 0; i < intArray.length; i++) {
        if (intArray[i] < min) {
          min = intArray[i];
          indexMin = i;
        }
      }

      System.out.println("Min from array = " + min + " and index = " + indexMin);

    }
}
