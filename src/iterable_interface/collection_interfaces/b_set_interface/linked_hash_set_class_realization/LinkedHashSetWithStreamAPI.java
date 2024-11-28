package iterable_interface.collection_interfaces.b_set_interface.linked_hash_set_class_realization;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedHashSetWithStreamAPI {

    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(List.of(10, 15, 20, 25, 30));

        // filter
        filteredMoreCondition(linkedHashSet, 20); // Filtered: [25, 30]

        // mapping
        mappedLinkedHashSetToString(linkedHashSet); // Mapped to String: [Number: 10, Number: 15, Number: 20, Number: 25, Number: 30]

        // find max/min
        findMaxElement(linkedHashSet); // Max element: 30
        findMinElement(linkedHashSet); // Min element: 10

        // collect to list
        collectedToList(linkedHashSet); // Converted to the List: [10, 15, 20, 25, 30]

        // convert to Array
        convertedToArray(linkedHashSet); // Converted to Array: [10, 15, 20, 25, 30]

        // count
        countElement(linkedHashSet, 15); // Count elements which > 15: 3

        // match all/any/none
        allMatchLinkedHashSet(linkedHashSet, 0); // All elements > 0: true
        anyMatchLinkedHashSet(linkedHashSet, 20); // Any elements > 20: true
        noneMatchLinkedHashSet(linkedHashSet, 0); // None elements < 0: true

    }

                        // FILTER

    private static void filteredMoreCondition(LinkedHashSet<Integer> linkedHashSet, int condition) {
        LinkedHashSet<Integer> filtered = linkedHashSet.stream()
                .filter(element -> element > condition)
                .collect(Collectors.toCollection(LinkedHashSet::new))
        ;

        System.out.println("Filtered: " + filtered);
    }

                        // MAP

    private static void mappedLinkedHashSetToString(LinkedHashSet<Integer> linkedHashSet) {
        LinkedHashSet<String> mappedLinkedHashSet = linkedHashSet.stream()
                .map(number -> "Number: " + number)
                .collect(Collectors.toCollection(LinkedHashSet::new))
        ;

        System.out.println("Mapped to String: " + mappedLinkedHashSet);
    }

                        // FIND MAX/MIN

    private static void findMaxElement(LinkedHashSet<Integer> linkedHashSet) {
        int max = linkedHashSet.stream()
                .max(Integer::compare)
                .orElseThrow(() -> new IllegalArgumentException("LinkedHashSet is empty."))
        ;

        System.out.println("Max element: " + max);
    }

    private static void findMinElement(LinkedHashSet<Integer> linkedHashSet) {
        int min = linkedHashSet.stream()
                .min(Integer::compare)
                .orElseThrow(() -> new IllegalArgumentException("LinkedHashSet is empty."))
        ;

        System.out.println("Min element: " + min);
    }

                            // COLLECT

    private static void collectedToList(LinkedHashSet<Integer> linkedHashSet) {
        List<Integer> collected = linkedHashSet.stream()
                .collect(Collectors.toList())
        ;

        System.out.println("Converted to the List: " + collected);
    }

                            // CONVERT TO ARRAY

    private static void convertedToArray(LinkedHashSet<Integer> linkedHashSet) {
        Integer[] array = linkedHashSet.stream()
                .toArray(Integer[]::new)
        ;

        System.out.println("Converted to Array: " + Arrays.toString(array));
    }

                            // COUNT

    private static void countElement(LinkedHashSet<Integer> linkedHashSet, int condition) {
        long count = linkedHashSet.stream()
                .filter(element -> element > 15)
                .count()
        ;

        System.out.println("Count elements which > " + condition + ": " + count);
    }

                            // MATCH ALL/ANY/NONE

    private static void allMatchLinkedHashSet(LinkedHashSet<Integer> linkedHashSet, int conditionMoreThan) {
        boolean allMatch = linkedHashSet.stream()
                .allMatch(element -> element > conditionMoreThan)
        ;

        System.out.println("All elements > " + conditionMoreThan + ": " + allMatch);
    }

    private static void anyMatchLinkedHashSet(LinkedHashSet<Integer> linkedHashSet, int conditionMoreThan) {
        boolean anyMatch = linkedHashSet.stream()
                .anyMatch(element -> element > conditionMoreThan)
        ;

        System.out.println("Any elements > " + conditionMoreThan + ": " + anyMatch);
    }

    private static void noneMatchLinkedHashSet(LinkedHashSet<Integer> linkedHashSet, int conditionLessThan) {
        boolean noneMatch = linkedHashSet.stream()
                .noneMatch(element -> element < conditionLessThan)
        ;

        System.out.println("None elements < " + conditionLessThan + ": " + noneMatch);
    }



}
