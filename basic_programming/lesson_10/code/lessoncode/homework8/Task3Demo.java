package homework8;

import java.util.Arrays;
import java.util.Random;

public class Task3Demo {
    public static void main(String[] args) {

        Random random = new Random();
        Task3 task3 = new Task3();
        int arraySize = 100;

        int[] workingArray = new int[arraySize];

        for (int i = 0; i < workingArray.length; i++) {
            workingArray[i] = random.nextInt(50);
        }

        System.out.println(Arrays.toString(workingArray));
        int maxNumber = 0;
        int maxCounter = 0;


        for (int i = 0; i < workingArray.length; i++) {
            int localMax = task3.countRepeat(workingArray, workingArray[i]);
            if (maxCounter < localMax){
                maxCounter = localMax;
                maxNumber = workingArray[i];
            }
        }

        System.out.println("В нашем массиве число " + maxNumber + " имеет максимальное количество повторений = " + maxCounter);
    }
}
