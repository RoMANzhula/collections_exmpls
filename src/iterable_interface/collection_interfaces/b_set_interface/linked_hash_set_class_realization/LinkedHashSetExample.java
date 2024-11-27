package iterable_interface.collection_interfaces.b_set_interface.linked_hash_set_class_realization;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // add elements
        linkedHashSet.add("One");
        linkedHashSet.add("Five");
        linkedHashSet.add("Two");
        linkedHashSet.add("Seven");
        System.out.println("Origin elements in the LinkedHashSet: " + linkedHashSet); // Origin elements in the LinkedHashSet: [One, Five, Two, Seven]

        // add last element
        linkedHashSet.addLast("LastElement");
        System.out.println("LinkedHashSet after add last element: " + linkedHashSet); // LinkedHashSet after add last element: [One, Five, Two, Seven, LastElement]

        // add first element
        linkedHashSet.addFirst("FirstElement");
        System.out.println("LinkedHashSet after add first element: " + linkedHashSet); // LinkedHashSet after add first element: [FirstElement, One, Five, Two, Seven, LastElement]

        // reverse
        System.out.println("Reversed LinkedHashSet: " + linkedHashSet.reversed()); // Reversed LinkedHashSet: [LastElement, Seven, Two, Five, One, FirstElement]

        // get first element
        String firstElement = linkedHashSet.getFirst();
        System.out.println("First element: " + firstElement); // First element: FirstElement

        // get last element
        String lastElement = linkedHashSet.getLast();
        System.out.println("Last element: " + lastElement); // First element: FirstElement

        // delete first element
        linkedHashSet.removeFirst();
        System.out.println("LinkedHashSet after removed first element: " + linkedHashSet); // LinkedHashSet after removed first element: [One, Five, Two, Seven, LastElement]

        // delete last element
        linkedHashSet.removeLast();
        System.out.println("LinkedHashSet after removed last element: " + linkedHashSet); // LinkedHashSet after removed last element: [One, Five, Two, Seven]

        // clone
//        @SuppressWarnings("unchecked")
//        Set<String> cloneLinkedHashSet = (Set<String>) linkedHashSet.clone();
        Set<String> cloneLinkedHashSet = new HashSet<>(linkedHashSet);
        System.out.println("Cloned to Set: " + cloneLinkedHashSet); // Cloned to Set: [Five, One, Seven, Two]

        // clear
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clear(): " + linkedHashSet); // LinkedHashSet after clear(): []

    }

}
