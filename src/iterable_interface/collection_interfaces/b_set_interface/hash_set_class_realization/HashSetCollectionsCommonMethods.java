package iterable_interface.collection_interfaces.b_set_interface.hash_set_class_realization;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetCollectionsCommonMethods {

    public static void main(String[] args) {

        // create and add
        HashSet<Integer> hashSet = new HashSet<>();
        Collections.addAll(hashSet, 5, 10, 15, 20, 25, 30);
        System.out.println("Original HashSet: " + hashSet); // Original HashSet: [20, 5, 25, 10, 30, 15]

        // frequency (not useful for Set? because all elements are unique)
        System.out.println("Frequency of 15: " + Collections.frequency(hashSet, 15)); // Frequency of 15: 1

        // get max/min value
        int max = Collections.max(hashSet);
        int min = Collections.min(hashSet);
        System.out.println("Max element: " + max + ", and min element: " + min); // Max element: 30, and min element: 5

        // get unmodified immutable wrapper
        Set<Integer> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        System.out.println("Unmodifiable Set: " + unmodifiableSet); // Unmodifiable Set: [20, 5, 25, 10, 30, 15]
//        unmodifiableSet.add(35); // get UnsupportedOperationException

        // singleton list (for example as temporary collection)
        Set<Integer> singletonSet = new HashSet<>(Collections.singletonList(100));
        System.out.println("Singleton Set: " + singletonSet); // Singleton Set: [100]

        // remove element as object
        hashSet.remove(5);
        System.out.println("HashSet after removed element 5: " + hashSet); // HashSet after removed element 5: [20, 25, 10, 30, 15]

        // return synchronized Set
        Set<Integer> synchronizedSet = Collections.synchronizedSet(hashSet);
        System.out.println("Synchronized Set: " + synchronizedSet); // Synchronized Set: [20, 25, 10, 30, 15]

        // return common elements from both collections
        HashSet<Integer> anotherSet = new HashSet<>(Arrays.asList(100, 110));
//        anotherSet.add(110);
//        anotherSet.add(100);
        System.out.println("Are disjoint: " + Collections.disjoint(hashSet, anotherSet)); // true (we don`t have same elements, if we have one or more same element(s) - returns false)

        // remove all elements
        hashSet.clear();
        System.out.println("HashSet after clear(): " + hashSet); // HashSet after clear(): []

    }

}
