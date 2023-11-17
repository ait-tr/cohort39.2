package conditionOperator;

public class ConditionOperator4 {
    public static void main(String[] args) {

        boolean isRain = false;
        boolean isSun = true;

        if (isSun && !isRain) {
            System.out.println("Идем гулять без зонта");
        } else {
            System.out.println("Сидим дома");
        }

    }
}
