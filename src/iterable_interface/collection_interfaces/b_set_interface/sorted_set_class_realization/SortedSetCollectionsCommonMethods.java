package iterable_interface.collection_interfaces.b_set_interface.sorted_set_class_realization;

import java.util.Arrays;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCollectionsCommonMethods {

    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(15, 10, 5, 20, 25));

        // create unmodifiable sortedSet
        SortedSet<Integer> unmodifiableSortedSet = Collections.unmodifiableSortedSet(sortedSet);
        System.out.println("Unmodifiable SortedSet: " + unmodifiableSortedSet); // Unmodifiable SortedSet: [5, 10, 15, 20, 25]
//        unmodifiableSortedSet.add(111); // get UnsupportedOperationException

        // get max and min value
        int max = Collections.max(sortedSet);
        int min = Collections.min(sortedSet);
        System.out.println("Max element: " + max); // Max element: 25
        System.out.println("Min element: " + min); // Min element: 5

        // fill
        Collections.addAll(sortedSet, 1, 2, 3);
        System.out.println("SortedSet add elements with Collections: " + sortedSet); // SortedSet add elements with Collections: [1, 2, 3, 5, 10, 15, 20, 25]

        // synchronized SortedSet
        SortedSet<Integer> synchronizedSortedSet = Collections.synchronizedSortedSet(sortedSet);
        synchronized (synchronizedSortedSet) {
            System.out.println("Synchronized SortedSet: " + synchronizedSortedSet); // Synchronized SortedSet: [1, 2, 3, 5, 10, 15, 20, 25]
        }

    }

}
