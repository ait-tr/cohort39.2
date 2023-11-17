package practice;

public class NumbersUtil {
    public void printSortedNumbers(int a, int b, int c, boolean type){
        int min, mid, max;

        min = Math.min(a, Math.min(b,c));
        max = Math.max(a, Math.max(b,c));
        mid = a + b + c - min - max;

        if (type) {
            System.out.println(min + ", " + mid + ", " + max);
        } else {
            System.out.println(max + ", " + mid + ", " + min);
        }

    }


}
