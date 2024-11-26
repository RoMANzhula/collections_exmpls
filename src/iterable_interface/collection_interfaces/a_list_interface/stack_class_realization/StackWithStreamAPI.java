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

                    // mapping
        mappedToString(stack); // An Integer stack is mapped to a String: [Ten, Twenty, Thirty, Forty]

                    // reduce
        reducedStackWithN(stack, 4); // Reduced stack plus _n_ number: 104

    }


                            // FILTER
    private static void filteredStack(Stack<Integer> stack) {
        Stack<Integer> filteredStack = stack.stream()
                .filter(element -> element > 20)
                .collect(Collectors.toCollection(Stack::new))
        ;

        System.out.println("Filtered stack > 20: " + filteredStack);
    }

                            // MAPPING
    private static void mappedToString(Stack<Integer> stack) {
        Map<Integer, String> numberToWordMap = Map.of(
                10, "Ten",
                20, "Twenty",
                30, "Thirty",
                40, "Forty"
        );

        Stack<String> mappedStack = stack.stream()
                .map(number -> numberToWordMap.getOrDefault(number, "Unknown"))
//                .forEach(System.out::println)
                .collect(Collectors.toCollection(Stack::new))
        ;

        System.out.println("An Integer stack is mapped to a String: " + mappedStack);
    }

                            // REDUCE
    private static void reducedStackWithN(Stack<Integer> stack, int n) {
        int sum = stack.stream()
                .reduce(n, Integer::sum)
        ;

        System.out.println("Reduced stack plus _n_ number: " + sum);

    }

}
