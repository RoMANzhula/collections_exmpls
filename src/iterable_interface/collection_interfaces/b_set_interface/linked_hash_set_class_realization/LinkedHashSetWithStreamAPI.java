package iterable_interface.collection_interfaces.b_set_interface.linked_hash_set_class_realization;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedHashSetWithStreamAPI {

    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(List.of(10, 15, 20, 25, 30));

        // filter
        filteredMoreCondition(linkedHashSet, 20); // Filtered: [25, 30]

    }

                        // FILTER

    private static void filteredMoreCondition(LinkedHashSet<Integer> linkedHashSet, int condition) {
        LinkedHashSet<Integer> filtered = linkedHashSet.stream()
                .filter(element -> element > condition)
                .collect(Collectors.toCollection(LinkedHashSet::new))
        ;

        System.out.println("Filtered: " + filtered);
    }

}
