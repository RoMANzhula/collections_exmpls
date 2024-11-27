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
        filteredHashSet(hashSet); // Filtered HashSet (starts with 'B'): [Banana]

        // mapping
        mappedHashSet(hashSet); // Mapped HashSet (to upper case): [DATE, CHERRY, APPLE, ELDERBERRY, BANANA]

        // find (any, first)
        findAll(hashSet); // Found fruit: Avocado
        findFirst(hashSet); // First element starts with 'A': Apple

    }

                            // FILTER

    private static void filteredHashSet(HashSet<String> hashSet) {
        HashSet<String> filteredSet = hashSet.stream()
                .filter(fruit -> fruit.startsWith("B"))
                .collect(Collectors.toCollection(HashSet::new))
        ;

        System.out.println("Filtered HashSet (starts with 'B'): " + filteredSet);
    }

                            // MAP

    private static void mappedHashSet(HashSet<String> hashSet) {
        HashSet<String> mappedHashSet = hashSet.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(HashSet::new))
        ;

        System.out.println("Mapped HashSet (to upper case): " + mappedHashSet);
    }

                            // FIND ANY/FIRST

    private static void findAll(HashSet<String> hashSet) {
        hashSet.add("Avocado");

        hashSet.stream()
                .filter(fruit -> fruit.startsWith("Av"))
                .findAny()
                .ifPresent(fruit -> System.out.println("Found fruit: " + fruit))
        ;
    }

    private static void findFirst(HashSet<String> hashSet) {
        hashSet.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .findFirst()
                .ifPresent(fruit -> System.out.println("First element starts with 'A': " + fruit))
        ;
    }


}
