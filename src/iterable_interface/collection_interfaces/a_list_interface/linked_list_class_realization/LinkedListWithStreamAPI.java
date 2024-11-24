package iterable_interface.collection_interfaces.a_list_interface.linked_list_class_realization;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LinkedListWithStreamAPI {

    public static void main(String[] args) {
        LinkedList<String> fruit = new LinkedList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Apricot");

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

                    // filtering
        filteredStringList(fruit, "A"); // Filtered by _A_ list: [Apple, Apricot]
        filteredNumberListMin(numbers);


    }

                                        // FILTERING

    private static void filteredStringList(LinkedList<String> list, String targetToFilter) {
        List<String> filteredList = list.stream()
                .filter(element -> element.startsWith(targetToFilter))
                .collect(Collectors.toList())
        ;

        System.out.println("Filtered by _" + targetToFilter + "_ list: " + filteredList);
    }

    private static void filteredNumberListMin(LinkedList<Integer> list) {
        Optional<Integer> min = list.stream()
                .filter(element -> element > 9)
                .min(Integer::compareTo)
        ;

        if (min.isPresent()) {
            System.out.println("Minimum filtered value: " + min.get());
        } else {
            System.out.println("No elements match the filter criteria.");
        }
    }

}
