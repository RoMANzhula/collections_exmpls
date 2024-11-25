package iterable_interface.collection_interfaces.a_list_interface.linked_list_class_realization;

import java.util.*;
import java.util.stream.Collectors;

public class LinkedListWithStreamAPI {

    public static void main(String[] args) {
        LinkedList<String> fruit = new LinkedList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Apricot");

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

                    // filtering
        filteredStringList(fruit, "A"); // Filtered by _A_ list: [Apple, Apricot]
        filteredNumberListMin(numbers); // Minimum filtered value: 10

                    // mapping (transforming)
        mappingToShorterWord(fruit, 3); // List with shorted words:[App, Ban, Ora, Apr]
        mappingToIncreaseOnN(numbers, 2); // All elements after increment: [12, 22, 32]

                    // sorting
        sortedByAlphabet(fruit); // Sorted list: [Apple, Apricot, Banana, Orange]
        sortedByDecreasingNumber(numbers); // Sorted numbers in descending order: [30, 20, 10]

                    // collecting
        collectedToSet(fruit); // Unique set from LinkedList: [Apple, Apricot, Orange, Banana]
        collectedToQueue(numbers); // Queue from LinkedList: [10, 20, 30, 10, 10]

                    // reducing
        reducedNumberElementsTo(numbers, 4); // Sum of elements: 84 (all sum + 4) - 80 because we added two new elements 10 and 10
        reducedAllStringLengthElements(fruit, 0); // Total sum of string lengths: 29 (Apple, Banana, Orange, Apricot, Apple) 29 + 0


    }

                                        // FILTERING

    private static void filteredStringList(LinkedList<String> list, String targetToFilter) {
        List<String> filteredList = list.stream()
                .filter(element -> element.startsWith(targetToFilter))
                .collect(Collectors.toList())
        ;

        System.out.println("Filtered by _" + targetToFilter + "_ list: " + filteredList);
    }

    private static void filteredNumberListMin(LinkedList<Integer> list) {
        Optional<Integer> min = list.stream()
                .filter(element -> element > 9)
                .min(Integer::compareTo)
        ;

        if (min.isPresent()) {
            System.out.println("Minimum filtered value: " + min.get());
        } else {
            System.out.println("No elements match the filter criteria.");
        }
    }

                                        // MAPPING

    private static void mappingToShorterWord(LinkedList<String> list, int wordLength) {
        List<String> result = list.stream()
                .map(word -> word.length() > wordLength ? word.substring(0, wordLength) : word)
                .collect(Collectors.toList())
        ;

        System.out.println("List with shorted words:" + result);
    }

    private static void mappingToIncreaseOnN(LinkedList<Integer> list, int plusThis) {
        List<Integer> result =  list.stream()
                .map(number -> number + plusThis)
                .toList()
        ;

        System.out.println("All elements after increment: " + result);
    }

                                        // SORTING

    private static void sortedByAlphabet(LinkedList<String> list) {
        List<String> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList())
        ;

        System.out.println("Sorted list: " + sortedList);
    }

    private static void sortedByDecreasingNumber(LinkedList<Integer> list) {
        List<Integer> sortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
        ;

        System.out.println("Sorted numbers in descending order: " + sortedList);
    }

                                        // COLLECTING

    private static void collectedToSet(LinkedList<String> list) {
        list.add("Apple"); // add a duplicate to the general list

        Set<String> uniqueSet = list.stream()
                .collect(Collectors.toSet())
        ;

        System.out.println("Unique set from LinkedList: " + uniqueSet);
    }

    private static void collectedToQueue(LinkedList<Integer> list) {
        list.add(10);
        list.add(10);

        Queue<Integer> queueFromLinkedList = list.stream()
                .collect(Collectors.toCollection(LinkedList::new))
        ;

        System.out.println("Queue from LinkedList: " + queueFromLinkedList);
    }

                                            // REDUCING

    private static void reducedNumberElementsTo(LinkedList<Integer> list, int addToSum) {
        int sum = list.stream()
                .reduce(addToSum, Integer::sum)
        ;

        System.out.println("Sum of elements: " + sum);
    }

    private static void reducedAllStringLengthElements(LinkedList<String> list, int addToSum) {
        int sum = list.stream()
                .mapToInt(String::length)
                .reduce(addToSum, Integer::sum)
        ;

        System.out.println("Total sum of string lengths: " + sum);
    }


}
