package lambda2;

public class ArrayLambda {
    public static void main(String[] args) {
        IArray<Integer> refInt = (array)
 -> {
            Integer max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            return max;
        };

        Integer[] array = {7,3,2,9,12,8,4};

        Lambda.findMax(array,refInt);

    }
}
