import javax.swing.*;

public class StackOverflowDemo {

    private static int count = 0;

    public static void main(String[] args) {
       try {
           recursiveCall();
       } catch (StackOverflowError e) {
           System.out.println("Stack overflow after " + count + " calls");
       }
    }
    public static void recursiveCall(){
        count++;
        recursiveCall();
    }
}
