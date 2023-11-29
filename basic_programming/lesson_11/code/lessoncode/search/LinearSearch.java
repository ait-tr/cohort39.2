package search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arrayForSearch = {8,3,5,2,1,4,7,6};

        int elementForSearch = 5;

        int indexSearch = -1;

        for (int i = 0; i < arrayForSearch.length; i++) {
            if (arrayForSearch[i] == elementForSearch) {
                indexSearch = i;
            }
        }

        if (indexSearch >= 0) {
            System.out.println("Search element " + elementForSearch + " in the our array has index " + indexSearch);
        } else {
            System.out.println("Search element " + elementForSearch + " didn't find in the our array!");
        }

    }
}
