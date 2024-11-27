package iterable_interface.collection_interfaces.b_set_interface.hash_set_class_realization;

import java.util.HashSet;
import java.util.stream.Collectors;

public class HashSetWithStreamAPI {

    public static void main(String[] args) {

        // create HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        hashSet.add("Elderberry");

        // filter
        filteredSet(hashSet); // Filtered HashSet (starts with 'B'): [Banana]

    }

                            // FILTER
    private static void filteredSet(HashSet<String> hashSet) {
        HashSet<String> filteredSet = hashSet.stream()
                .filter(fruit -> fruit.startsWith("B"))
                .collect(Collectors.toCollection(HashSet::new))
        ;

        System.out.println("Filtered HashSet (starts with 'B'): " + filteredSet);
    }

}
