package random;

public class RandomExample {
    public static void main(String[] args) {

        double random1 = Math.random() * 100;
        // умножая на 100 мы получаем число в диапазоне 0 - 99.999999

        /*
        Вопрос: а как нам получить псевдослучайное число в диапазоне от
        числа min до числа max

        min + random * (max - min +1)

         */
        double random2 = Math.random() * (50 - 10 + 1) + 10;
        double random3 = Math.random() * (100 - 0 + 1) + 0;
        double random4 = Math.random() * (150 - 120 + 1) + 120;
        double random5 = Math.random() * (1000000 - 150000 + 1) + 150000;


        System.out.println("1st random example: " + Math.round(random1));
        System.out.println("2nd random example: " + Math.round(random2));
        System.out.println("3rd random example: " + Math.round(random3));
        System.out.println("4th random example: " + Math.round(random4));
        System.out.println("5th random example: " + Math.round(random5));

    }
}
