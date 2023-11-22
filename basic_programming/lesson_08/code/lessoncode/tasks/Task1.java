package tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Please enter array size ");
      int arraySize = scanner.nextInt();

      ArrayOperations ao = new ArrayOperations();

      int[] intArray = new int[arraySize];

      ao.fillArrayByRandom(intArray, 20);

      System.out.println(Arrays.toString(intArray));

      ArrayResult maxFromArray = ao.maxOfArrayElement(intArray);

      System.out.println("Max from array = " + maxFromArray.getMaxElement() + " index = " + maxFromArray.getIndexOfMaxElement() );

      int sumOfArrayElements = ao.sumOfArrayElements(intArray);

      System.out.println("Sum of array elements = " + sumOfArrayElements );

      System.out.println("Array indexes: " + Arrays.toString(ao.arrayIndexForMaxElements(intArray)));

    }
}
