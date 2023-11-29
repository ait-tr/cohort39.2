package sort;

import java.util.Arrays;

public class ArraySort {

    public void bubbleSort(int[] workingArray){
        boolean notSorted = true;
        int temp;

        // {1,2,3,4,5,6,7,8} - если мы меняем хотя бы одну пару -
        // то это означает что наш массив все еще не отсортирован

        while (notSorted) {
            System.out.println(notSorted);
            System.out.println(Arrays.toString(workingArray));
            notSorted = false;
            for (int i = 0; i < workingArray.length - 1; i++) {
                if (workingArray[i] > workingArray[i + 1]) {
                    temp = workingArray[i];
                    workingArray[i] = workingArray[i + 1];
                    workingArray[i + 1] = temp;
                    notSorted = true;
                    //System.out.println(Arrays.toString(workingArray));
                }
            }
        }

    }

    // ----------------------------------------------

    public void chooseSort(int[] workingArray){
        for (int i = 0; i < workingArray.length; i++) {
            System.out.println("Итерация " + i);
            System.out.println(Arrays.toString(workingArray));
            int min = workingArray[i];
            int minId = i;
            for (int j = i + 1; j < workingArray.length ; j++) {
                if (workingArray[j] < min) {
                    min = workingArray[j];
                    minId = j;
                }
            }
            System.out.println(i + " element - " + workingArray[i] + " will change " + minId + " index " + min +  " value");
            int temp = workingArray[i];
            workingArray[i] = min;
            workingArray[minId] = temp;
        }
    }

    // ----------------------------------------------

    public void insertSort(int[] workingArray){
        for (int i = 1; i < workingArray.length; i++) {
            System.out.println("Итерация " + i);
            System.out.println(Arrays.toString(workingArray));

            int currentElement = workingArray[i];
            int j = i - 1;
            while ((j >= 0) && (currentElement < workingArray[j])) {
                workingArray[j+1] = workingArray[j];
                j--;
            }
            workingArray[j+1] = currentElement;
        }
    }
}
