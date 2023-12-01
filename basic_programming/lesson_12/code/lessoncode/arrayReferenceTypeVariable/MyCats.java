package arrayReferenceTypeVariable;

import java.util.Arrays;

public class MyCats {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];

        Cat cat1 = new Cat(2, "Murzik");
        Cat cat2 = new Cat(4, "Barsik");
        Cat cat3 = new Cat(7, "Vas'ka");


        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;


        System.out.println(Arrays.toString(cats));

        //cats[0].name = "Dexter";
        cat1.name = "Dexter";

        System.out.println(Arrays.toString(cats));

    }
}
