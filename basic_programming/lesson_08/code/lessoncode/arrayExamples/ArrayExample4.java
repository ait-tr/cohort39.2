package arrayExamples;

import java.util.Arrays;

public class ArrayExample4 {
    public static void main(String[] args) {



      int [][] twoDimArray = {{1,2,3,4},{5,6},{7,8,9,10,11,12}};

      System.out.println(Arrays.toString(twoDimArray));
      System.out.println(Arrays.toString(twoDimArray[0]));
      System.out.println(Arrays.toString(twoDimArray[1]));
      System.out.println(Arrays.toString(twoDimArray[2]));


      for (int i = 0; i < twoDimArray.length; i++) {
        for (int j = 0; j < twoDimArray[i].length; j++) {
          System.out.println("Element " + i + " line " + j + " column " + twoDimArray[i][j]);
        }
      }

    }
}
