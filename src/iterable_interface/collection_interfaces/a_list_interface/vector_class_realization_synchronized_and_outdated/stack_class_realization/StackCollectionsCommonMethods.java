package iterable_interface.collection_interfaces.a_list_interface.vector_class_realization_synchronized_and_outdated.stack_class_realization;

import java.util.Collections;
import java.util.Stack;

public class StackCollectionsCommonMethods {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(7);
        stack.push(2);
        stack.push(5);

        // sort
        Collections.sort(stack);
        System.out.println("Sorted stack: " + stack); // Sorted stack: [1, 2, 5, 7]

        // reverse
        Collections.reverse(stack);
        System.out.println("Reversed stack: " + stack); // Reversed stack: [7, 5, 2, 1]

        // shuffle
        Collections.shuffle(stack);
        System.out.println("Shuffled stack: " + stack); // Shuffled stack: [7, 5, 1, 2] (can be many different options)

        // get max value
        int max = Collections.max(stack);
        System.out.println("Max element of stack is: " + max); // Max element of stack is: 7

        // get min value
        int min = Collections.min(stack);
        System.out.println("Min element of stack is: " + min); // Min element of stack is: 1

        // swapping two elements of stack
        System.out.println("Stack now: " + stack); // Stack now: [1, 2, 7, 5] (can be different options)
        Collections.swap(stack, 0, 2);
        System.out.println("Stack after swap: " + stack); // Stack after swap: [7, 2, 1, 5] (can be different options)

        // get index of sublist
        Stack<Integer> subStack = new Stack<>();
        subStack.push(1);
        int indexOfSubStack = Collections.indexOfSubList(stack, subStack);
        System.out.println("Index of the subStack in the stack: " + indexOfSubStack); // Index of the subStack in the stack: 2

        // filling stack
        Collections.fill(stack, 9);
        System.out.println("Filled stack: " + stack); // Filled stack: [9, 9, 9, 9]

    }

}
