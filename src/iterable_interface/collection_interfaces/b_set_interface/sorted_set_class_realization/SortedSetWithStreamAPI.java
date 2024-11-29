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


    }

                        // PRINT ALL

    private static void printAll(SortedSet<Integer> sortedSet) {
        sortedSet.stream()
                .forEach(System.out::println)
        ;
    }


}
