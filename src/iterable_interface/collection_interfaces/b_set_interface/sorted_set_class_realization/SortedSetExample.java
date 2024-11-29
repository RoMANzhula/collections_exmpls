package iterable_interface.collection_interfaces.b_set_interface.sorted_set_class_realization;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(3);
        sortedSet.add(9);
        sortedSet.add(4);
        sortedSet.add(7);
        sortedSet.add(2);

        System.out.println("Sorted set: " + sortedSet); // Sorted set: [2, 3, 4, 7, 9]

        // get first element
        System.out.println("First element: " + sortedSet.getFirst()); // First element: 2

        // get last element
        System.out.println("Last element: " + sortedSet.getLast()); // Last element: 9

        // sorted up to 4 not inclusive
        SortedSet<Integer> headSet = sortedSet.headSet(4);
        System.out.println("HeadSet (to 4 not inclusive): " + headSet); // HeadSet (to 4 not inclusive): [2, 3]

        // sorted from 4 inclusive
        SortedSet<Integer> tailSet = sortedSet.tailSet(4);
        System.out.println("TailSet (from 4 inclusive): " + tailSet); // TailSet (from 4 inclusive): [4, 7, 9]

        // sorted subSortedSet from(inclusive) to(not inclusive)
        SortedSet<Integer> subSet = sortedSet.subSet(3, 7);
        System.out.println("SubSet (from 3 to 7): " + subSet); // SubSet (from 3 to 7): [3, 4]

        // reverse
        System.out.println("Reversed set: " + sortedSet.reversed()); // Reversed set: [9, 7, 4, 3, 2]

        // delete last element
        sortedSet.removeLast();
        System.out.println("After remove last: " + sortedSet); // After remove last: [2, 3, 4, 7]

        // delete first element
        sortedSet.removeFirst();
        System.out.println("After remove first: " + sortedSet); // After remove first: [3, 4, 7]

        // reverse
        System.out.println("Reversed: " + sortedSet.reversed()); // Reversed: [7, 4, 3]

        // delete all
        sortedSet.clear();
        System.out.println("After clear(): " + sortedSet); // After clear(): []

    }

}
