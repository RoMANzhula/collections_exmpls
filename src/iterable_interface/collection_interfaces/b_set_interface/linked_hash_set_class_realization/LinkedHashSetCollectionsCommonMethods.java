package iterable_interface.collection_interfaces.b_set_interface.linked_hash_set_class_realization;

import java.util.*;

public class LinkedHashSetCollectionsCommonMethods {

    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // add new elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");

        // add a list of elements
        linkedHashSet.addAll(List.of("Dog", "Tree"));
        System.out.println("Elements of LinkedHashSet: " + linkedHashSet); // Elements of LinkedHashSet: [Apple, Banana, Cherry, Dog, Tree]

        // contains
        System.out.println("Contains 'Apple': " + linkedHashSet.contains("Apple")); // Contains 'Apple': true

        // is empty
        System.out.println("Is empty: " + linkedHashSet.isEmpty()); // Is empty: false

        // get size
        System.out.println("Size: " + linkedHashSet.size()); // Size: 5

        // iteration
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
            // and for-each
        for (String element : linkedHashSet) {
            System.out.println("Element: " + element);
        }

        // convert to array and list
        String[] array = linkedHashSet.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array)); // Array: [Apple, Banana, Cherry, Dog, Tree]
        ArrayList<String> arrayList = new ArrayList<>(linkedHashSet);
        System.out.println("ArrayList: " + arrayList); // ArrayList: [Apple, Banana, Cherry, Dog, Tree]

        // merger
        LinkedHashSet<String> anotherLinkedHashSet = new LinkedHashSet<>(List.of("Day", "Night", "Noon", "Dog", "Apple"));
        linkedHashSet.retainAll(anotherLinkedHashSet);
        System.out.println("After retainAll (linkedHashSet): " + linkedHashSet); // After retainAll (linkedHashSet): [Apple, Dog]
        anotherLinkedHashSet.removeAll(linkedHashSet);
        System.out.println("After removeAll (anotherLinkedHashSet): " + anotherLinkedHashSet); // After removeAll (anotherLinkedHashSet): [Day, Night, Noon]

        // delete elements
        linkedHashSet.remove("Dog");
        System.out.println("LinkedHashSet after removed 'Dog': " + linkedHashSet); // LinkedHashSet after removed 'Dog': [Apple]
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clear(): " + linkedHashSet); // LinkedHashSet after clear(): []

    }

}
