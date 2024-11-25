package iterable_interface.collection_interfaces.a_list_interface.stack_class_realization;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // add elements
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        System.out.println("Stack after pushing elements: " + stack);

        // get element from top (stack removes it from the stack)
        System.out.println("Element of the stack top is: " + stack.pop()); // Element of the stack top is: Three
        System.out.println("Stack after pop() element: " + stack); // [One, Two] - "Three" LIFO

        // checking element on the top of stack
        System.out.println("Upper element (view) after popping: " + stack.peek()); // Upper element (view) after popping: Two

        // emptiness check
        System.out.println("Is the stack empty: " + stack.isEmpty()); // Is the stack empty: false

        // iteration
        System.out.println();
        System.out.print("All elements: "); // All elements: One Two
        for (String item : stack) {
            System.out.print(item + " ");
        }

        // searching (yes 1 / no -1)
        System.out.println("We look for _Three_: " + stack.search("Two")); // All elements: One Two We look for _Three_: 1

    }

}
