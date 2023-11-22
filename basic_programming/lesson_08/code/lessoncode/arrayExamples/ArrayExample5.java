package arrayExamples;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample5 {
    public static void main(String[] args) {


      Scanner scanner = new Scanner(System.in);
      Random random = new Random();

      System.out.println("Please enter your array size: ");
      int arraySize = scanner.nextInt();

      int[] intArray = new int[arraySize];

      for (int i = 0; i < intArray.length; i++) {
        //intArray[i] = random.nextInt(100);
        System.out.println("Please enter " + i + " element of array");
        intArray[i] = scanner.nextInt();
      }

      System.out.println(Arrays.toString(intArray));

    }
}
