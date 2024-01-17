package stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("I");
        stack.push("love");
        stack.push("Java");

        System.out.println(stack);

        System.out.println("The element at the top of the Stack is: " + stack.peek());

        System.out.println(stack);

        System.out.println("Pop element " + stack.pop());

        System.out.println(stack);

        System.out.println("Pop element " + stack.pop());

        System.out.println("Pop element " + stack.pop());

        System.out.println(stack);

        System.out.println(stack.empty());


    }
}
