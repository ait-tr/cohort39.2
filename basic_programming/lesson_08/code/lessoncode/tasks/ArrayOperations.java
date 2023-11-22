package tasks;

import java.util.Random;

public class ArrayOperations {

    public int[] fillArrayByRandom(int[] workingArray, int range) {
        Random random = new Random();

        for (int i = 0; i < workingArray.length; i++) {
            workingArray[i] = random.nextInt(range);
        }

        return workingArray;
    }

    public int sumOfArrayElements(int[] workingArray){
        int sum = 0;
        for (int i = 0; i < workingArray.length; i++) {
            sum = sum + workingArray[i];
        }
        return sum;
    }

    public ArrayResult maxOfArrayElement(int[] workingArray){
        ArrayResult result = new ArrayResult(workingArray[0],0);
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] > result.getMaxElement()) {
                result.setMaxElement(workingArray[i]);
                result.setIndexOfMaxElement(i);
            }
        }
        return result;
    }

    public int[] arrayIndexForMaxElements(int[] workingArray){

        int max = workingArray[0];
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] > max) {
                max = workingArray[i];
            }
        }

        int counter = 0;
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] == max) {
               counter++;
            }
        }

        int countIndex = 0;
        int[] indexArray = new int[counter];
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] == max) {
                indexArray[countIndex] = i;
                countIndex++;
            }
        }

        return indexArray;
    }
}
