package conditions;

public class ThreeNumbersCompare {

    public int compare(int first, int second, int third){
        int compareResult = 0;

        if ((first >= second) && (first >= third)) {compareResult = first;}
        if ((second >= first) && (second >= third)) {compareResult = second;}
        if ((third >= first) && (third >= second)) {compareResult = third;}

        return compareResult;
    }

    public int compareTwoNumbers(int x, int y){
//        if (x > y) {
//            return x;
//        } else {
//            return y;
//        }
        // аналогично записи через тернарный оператор

       return (x > y) ? x : y;
    }
}
