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


}
