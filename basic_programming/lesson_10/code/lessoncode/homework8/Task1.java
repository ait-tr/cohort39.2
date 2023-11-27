package homework8;

public class Task1 {

    public int[] reverseArray(int[] workingArray){
        int[] reverseArray = new int[workingArray.length];
        for (int i = 0; i < reverseArray.length; i++) {
            int j = reverseArray.length - 1 - i;
            reverseArray[i] = workingArray[j];

            /*
            {1 , 2, 3, 4}
            {4,            }
             */
        }
        return reverseArray;
    }
}
