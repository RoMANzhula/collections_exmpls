package iterable_interface.collection_interfaces.a_list_interface.array_list_class_realization;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithStreamAPI {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Orange", "Apple", "Melon"));
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 5, 3, 8, 1, 7, 2, 4));

        filterByConditionFirstWord(fruits, "A"); // Apple
        countElementsByCondition(numbers, 1); // 2
    }

                                // FILTERS

    private static void filterByConditionFirstWord(ArrayList<String> list, String word) {
        list.stream()
                .filter(element -> element.startsWith(word))
                .forEach(System.out::println)
        ;
    }

    private static void countElementsByCondition(ArrayList<Integer> list, int number) {
        long count = list.stream()
                .filter(element -> element.equals(number))
                .count()
        ;

        System.out.println(count);
    }

                                // TRANSFORMATION



}
