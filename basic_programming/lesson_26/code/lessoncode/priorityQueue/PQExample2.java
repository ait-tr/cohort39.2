package priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQExample2 {
    public static void main(String[] args) {
        Queue<Cat> cats = new PriorityQueue<>();

        cats.add(new Cat(1,"Murzik"));
        cats.add(new Cat(2,"Barsik"));
        cats.add(new Cat(3,"Barsik"));
        cats.add(new Cat(5,"Murzik"));


       // System.out.println(cats);

        while (!cats.isEmpty()){
            System.out.print(cats.poll() + " ");
        }

    }
}
