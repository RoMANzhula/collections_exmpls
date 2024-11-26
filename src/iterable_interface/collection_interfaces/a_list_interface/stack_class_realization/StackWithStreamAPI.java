package iterable_interface.collection_interfaces.a_list_interface.stack_class_realization;

import java.util.List;
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

                    // collection
        collectedStack(stack); // Collecting list from stack: [10, 20, 30, 40]

                    // match (all, any, none)
        matchedStack(stack); // All elements are positive: true  Any element greater than 10: true  No negative elements: true

                    // sorting
        sortedStack(stack); // Sorted stack: [10, 20, 30, 40]

                    // counting
        countAllElements(stack); // Number of elements in stack: 4

                    // iterate
        iteratedStack(stack); // 10 20 30 40

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

                            // COLLECTION
    private static void collectedStack(Stack<Integer> stack) {
        List<Integer> listFromStack = stack.stream()
                .collect(Collectors.toList()) // or toList()
        ;

        System.out.println("Collection of list from stack: " + listFromStack);
    }

                            // MATCH
    private static void matchedStack(Stack<Integer> stack) {
        boolean allPositive = stack.stream().allMatch(x -> x > 0);
        System.out.println("All elements are positive: " + allPositive);

        boolean anyGreaterThan10 = stack.stream().anyMatch(x -> x > 10);
        System.out.println("Any element greater than 10: " + anyGreaterThan10);

        boolean noneNegative = stack.stream().noneMatch(x -> x < 0);
        System.out.println("No negative elements: " + noneNegative);
    }

                            // SORT
    private static void sortedStack(Stack<Integer> stack) {
        Stack<Integer> sortedStack = stack.stream()
                .sorted()
                .collect(Collectors.toCollection(Stack::new))
        ;

        System.out.println("Sorted stack: " + sortedStack);
    }

                            // COUNT
    private static void countAllElements(Stack<Integer> stack) {
        long count = stack.stream().count();

        System.out.println("Number of elements in stack: " + count);
    }

                            // ITERATE
    private static void iteratedStack(Stack<Integer> stack) {
        stack.stream()
                .forEach(System.out::println)
        ;
    }

}
