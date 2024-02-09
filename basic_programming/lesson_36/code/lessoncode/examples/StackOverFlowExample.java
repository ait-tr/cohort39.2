package examples;

import java.util.ArrayList;

public class StackOverFlowExample {
    public static void main(String[] args) {
        StackOverFlowExample no = new StackOverFlowExample();

        int count = 0;
        no.stackOff(count);


    }

    public void stackOff(int count){
        count++;
        System.out.println(count + "; ");
        stackOff(count);
    }
}
