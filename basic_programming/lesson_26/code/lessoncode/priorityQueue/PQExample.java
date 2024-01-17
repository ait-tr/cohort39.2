package priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQExample {
    public static void main(String[] args) {
        Queue<String> towns = new PriorityQueue<>();

        towns.add("ROMA");
        towns.add("BERLIN");
        towns.add("LONDON");
        towns.add("AMSTERDAM");
        towns.add("PARIS");


        //System.out.println(towns);

        while (!towns.isEmpty()){
            System.out.print(towns.poll() + " ");
        }
    }
}
