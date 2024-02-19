package collections.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();

        strings.push("Element 1");
        strings.push("Element 2");
        strings.push("Element 3");
        strings.push("Element 4");
        strings.push("Element 5");
        strings.push("Element 7");
        strings.push("Element 7");
        strings.push("Element 7");
        strings.push("Element 7");
        strings.push("Element 7");
        strings.push("Element 7");
        strings.push("Element 7");
        strings.push("Element 7");


        System.out.println(strings);

        System.out.println(strings.peek());
        System.out.println(strings);

        System.out.println(strings.pop());
        System.out.println(strings);

        System.out.println(strings.size());

        System.out.println(strings.contains("Element 4"));
        System.out.println(strings.search("Element 4"));

    }
}
