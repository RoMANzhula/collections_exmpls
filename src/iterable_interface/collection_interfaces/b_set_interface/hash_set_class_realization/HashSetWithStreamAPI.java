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

        // match (all/any/none)
        allMatchHashSet(hashSet); // All elements have length > 3: true
        anyMatchHashSet(hashSet); // Contains 'Banana': false
        noneMatchHashSet(hashSet); // Contains no 'Cucumber': true

        // counting
        countElementsMoreThanCondition(hashSet, 10); // Count of fruits with length > 10: 0

        // sort
        sortedHashSet(hashSet); // Sorted fruit: Apple   Sorted fruit: Avocado ...

        // reduce
        reducedHashSet(hashSet); // Concatenated string from HashSet: Apple, Cherry, Avocado, Date, Elderberry, Banana,

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

                            // MATCH (ANY/ALL/NONE)

    private static void allMatchHashSet(HashSet<String> hashSet) {
        boolean allMatch = hashSet.stream()
                .allMatch(fruit -> fruit.length() > 3)
        ;

        System.out.println("All elements have length > 3: " + allMatch);
    }

    private static void anyMatchHashSet(HashSet<String> hashSet) {
        boolean allMatch = hashSet.stream()
                .allMatch(fruit -> fruit.equals("Banana") )
        ;

        System.out.println("Contains 'Banana': " + allMatch);
    }

    private static void noneMatchHashSet(HashSet<String> hashSet) {
        boolean noneMatch = hashSet.stream()
                .noneMatch(fruit -> fruit.equals("Cucumber"))
        ;

        System.out.println("Contains no 'Cucumber': " + noneMatch);
    }

                            // COUNT

    private static void countElementsMoreThanCondition(HashSet<String> hashSet, int condition) {
        long count = hashSet.stream()
                .filter(element -> element.length() > condition)
                .count()
        ;

        System.out.println("Count of fruits with length > " + condition + ": " + count);
    }

                            // SORT

    private static void sortedHashSet(HashSet<String> hashSet) {
        hashSet.stream()
                .sorted()
                .forEach(element -> System.out.println("Sorted fruit: " + element))
        ;
    }

                            // REDUCE

    private static void reducedHashSet(HashSet<String> hashSet) {
        String concatenated = hashSet.stream()
                .reduce("", (acc, element) -> acc + element + ", ")
        ;

        System.out.println("Concatenated string from HashSet: " + concatenated);
    }


}
