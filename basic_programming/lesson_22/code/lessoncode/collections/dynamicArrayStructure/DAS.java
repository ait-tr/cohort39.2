package collections.dynamicArrayStructure;

public class DAS {

    public int[] addNewElement(int[] workingArray, int newElement){
        int[] newArray = new int[workingArray.length + 1];
        for (int i = 0; i < workingArray.length; i++) {
            newArray[i] = workingArray[i];
        }
        newArray[newArray.length - 1] = newElement;
        return newArray;
    }

}
