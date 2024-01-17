package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        int time = 100;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = time; i >= 0  ; i--) {
            queue.add(i);
        }

        System.out.println(queue);

        for (int i = 0; i <= 100; i++) {
            System.out.println(queue.poll());
        }

        System.out.println(queue);
        System.out.println("=========== ГОРОДА ========");

        Queue<String> queueTown = new LinkedList<>();
        queueTown.offer("Харьков");
        queueTown.offer("Киев");
        queueTown.offer("Кременчуг");
        queueTown.offer("Львов");

        System.out.println(queueTown.peek());

        String town;
        while ((town = queueTown.poll()) != null) {
            System.out.println(town);
        }
    }
}
