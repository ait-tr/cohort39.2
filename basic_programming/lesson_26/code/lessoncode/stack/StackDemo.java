package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("Our Stack is:" + stack);
        showpush(stack, 22);
        showpush(stack, 32);
        showpush(stack, 42);

        showpop(stack);
        showpop(stack);
        showpop(stack);

        if (!stack.empty()) {showpop(stack);}

    }

    static void showpush(Stack stack, int numberForStack){
        stack.push(numberForStack);
        System.out.println("Push (" + numberForStack + ")");
        System.out.println("Our Stack:" + stack);
    }

    static void showpop(Stack stack){
        System.out.println("Take element from Stack ->");
        Integer numberFromStack = (Integer) stack.pop();
        System.out.println("Pop "  + numberFromStack );
        System.out.println("Our Stack:" + stack);
    }
}
