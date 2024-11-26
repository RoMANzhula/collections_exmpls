package iterable_interface.collection_interfaces.a_list_interface.stack_class_realization;

import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class StackWithStreamAPI {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

                    // filter
        filteredStack(stack); // Filtered stack > 20: [30, 40]

    }


                            // FILTER
    private static void filteredStack(Stack<Integer> stack) {
        Stack<Integer> filteredStack = stack.stream()
                .filter(element -> element > 20)
                .collect(Collectors.toCollection(Stack::new))
        ;

        System.out.println("Filtered stack > 20: " + filteredStack);
    }


}
