package homework7;

import java.util.Arrays;

public class Task1Demo {
    public static void main(String[] args) {
        Task1 task1 = new Task1();

        System.out.println("Возведение числа 3 в степень 4: " + task1.pow(3,4) );

        int[] aver = {1,2,3,4,5,6,7,8,9};
        System.out.println("Среднее арифметическое чисел " + Arrays.toString(aver) + " : " + task1.average(aver));
    }
}
