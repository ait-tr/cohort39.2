package loopFor;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(random.nextInt(100));
            } else {
                System.out.println(100 + random.nextInt(900));
            }
        }
    }
}
