package arrayExamples;

import java.util.Arrays;

public class ArrayExample3 {
    public static void main(String[] args) {

      int[] oneDimArray = new int[3];

      int [][] twoDimArray = new int[3][4];

      twoDimArray[0][0] = 1;
      twoDimArray[0][1] = 2;
      twoDimArray[0][2] = 3;
      twoDimArray[0][3] = 4;

      twoDimArray[1][0] = 5;
      twoDimArray[1][1] = 6;
      twoDimArray[1][2] = 7;
      twoDimArray[1][3] = 8;

      twoDimArray[2][0] = 9;
      twoDimArray[2][1] = 10;
      twoDimArray[2][2] = 11;
      twoDimArray[2][3] = 12;

      System.out.println(Arrays.toString(twoDimArray));
      System.out.println(Arrays.toString(twoDimArray[0]));
      System.out.println(Arrays.toString(twoDimArray[1]));
      System.out.println(Arrays.toString(twoDimArray[2]));

      //============

      int [][] twoDimArray2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

      System.out.println("=========== another way ========");
      System.out.println(Arrays.toString(twoDimArray2));
      System.out.println(Arrays.toString(twoDimArray2[0]));
      System.out.println(Arrays.toString(twoDimArray2[1]));
      System.out.println(Arrays.toString(twoDimArray2[2]));

    }
}
