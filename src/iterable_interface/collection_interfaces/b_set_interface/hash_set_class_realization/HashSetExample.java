package iterable_interface.collection_interfaces.b_set_interface.hash_set_class_realization;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(); // (Arrays.asList("One", "Three", "Two", "Four"));
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        System.out.println(hashSet);

        // get size of hashSet
        System.out.println("Size of hashSet: " + hashSet.size()); // Size of hashSet: 4

        // if contains element
        boolean isContains = hashSet.contains("Two");
        System.out.println("Is hashSet contain element 'Two': " + isContains); // Is hashSet contain element 'Two': true

        // remove element
        hashSet.remove("Four");
        System.out.println("HashSet after removed 'Four': " + hashSet); // HashSet after removed 'Four': [One, Two, Three]

        // clone
//        @SuppressWarnings("unchecked")
//        HashSet<String> cloneHashSet = (HashSet<String>) hashSet.clone();
        HashSet<String> cloneHashSet = new HashSet<>(hashSet);
        System.out.println("Cloned hashSet: " + cloneHashSet); // Cloned hashSet: [One, Two, Three]

        // get hashCode
        System.out.println("HashCode of hashSet: " + hashSet.hashCode()); // HashCode of hashSet: 80950768

        // get hashCode for each element
        for (String element : hashSet) {
            System.out.println("HashCode of element is: " + element.hashCode()); // HashCode of element is: 79430  HashCode of element is: 84524  HashCode of element is: 80786814
        }

    }

}
