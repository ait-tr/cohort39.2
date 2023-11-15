package random;

import java.util.Random;

public class RandomExample2 {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println(random.nextInt(100));
        System.out.println(random.nextDouble(1000.0));
    }
}
