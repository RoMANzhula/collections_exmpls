package iterable_interface.collection_interfaces.b_set_interface.sorted_set_class_realization;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortedSetWithStreamAPI {

    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(5, 10, 25, 20, 15));

        // print all element
        printAll(sortedSet); // 5 10 15 20 25

        // filter
        filteredMoreThanCondition(sortedSet, 10); // 15, 20, 25

        // map
        mappedIncreasedTwice(sortedSet); // Mapped: [10, 20, 30, 40, 50]

        // sort
        sortedAsReverse(sortedSet); // 25, 20, 15, 10, 5

        // match all/any/none
        allMatchMoreThan(sortedSet, 0); // All match > 0: true
        anyMatchMoreThan(sortedSet, 15); // Any match > 15: true
        noneMatchLessThan(sortedSet, 0); // None match < 0: false

        // count
        countElementsMoreThanCondition(sortedSet, 10); // Element(s) > 10: 3

    }

                        // PRINT ALL

    private static void printAll(SortedSet<Integer> sortedSet) {
        sortedSet.stream()
                .forEach(System.out::println)
        ;
    }

                        // FILTER

    private static void filteredMoreThanCondition(SortedSet<Integer> sortedSet, int condition) {
        sortedSet.stream()
                .filter(element -> element > condition)
                .forEach(System.out::println)
        ;
    }

                        // MAP

    private static void mappedIncreasedTwice(SortedSet<Integer> sortedSet) {
        SortedSet<Integer> mappedSortedSet = sortedSet.stream()
                .map(element -> element * 2)
                .collect(Collectors.toCollection(TreeSet::new))
        ;

        System.out.println("Mapped: " + mappedSortedSet);
    }

                        // SORTED

    private static void sortedAsReverse(SortedSet<Integer> sortedSet) {
        sortedSet.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println)
        ;
    }

                        // MATCH ALL/ANY/NONE

    private static void allMatchMoreThan(SortedSet<Integer> sortedSet, int condition) {
        boolean allMatch = sortedSet.stream()
                .allMatch(element -> element > 0)
        ;

        System.out.println("All match > " + condition + ": " + allMatch);
    }

    private static void anyMatchMoreThan(SortedSet<Integer> sortedSet, int condition) {
        boolean anyMatch = sortedSet.stream()
                .anyMatch(element -> element > 0)
                ;

        System.out.println("Any match > " + condition + ": " + anyMatch);
    }

    private static void noneMatchLessThan(SortedSet<Integer> sortedSet, int condition) {
        boolean noneMatch = sortedSet.stream()
                .noneMatch(element -> element > 0)
                ;

        System.out.println("None match < " + condition + ": " + noneMatch);
    }

                        // COUNT

    private static void countElementsMoreThanCondition(SortedSet<Integer> sortedSet, int condition) {
        long count = sortedSet.stream()
                .filter(element -> element > condition)
                .count()
        ;

        System.out.println("Element(s) > " + condition + ": " + count);
    }

}
