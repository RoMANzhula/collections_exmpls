package iterable_interface.collection_interfaces.a_list_interface.array_list_class_realization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListWithStreamAPI {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Orange", "Apple", "Melon"));
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 5, 3, 8, 1, 7, 2, 4));

                    // filtering
        filterByConditionFirstWord(fruits, "A"); // Apple
        countElementsByCondition(numbers, 1); // 2

                    // mapping (transforming)
        mappingToUpperCase(fruits); // BANANA ORANGE APPLE MELON (each in new row)
        mappingToUpperCaseInOneLine(fruits); // BANANA, ORANGE, APPLE, MELON
        mappingNumberToWords(numbers); // One Two Five Three Eight One Seven Two Four
        mappingNumberToBinary(numbers); // 1 10 101 11 1000 1 111 10 100 (each in new row)
    }

                                // FILTERS

    private static void filterByConditionFirstWord(ArrayList<String> list, String word) {
        list.stream()
                .filter(element -> element.startsWith(word))
                .forEach(System.out::print)
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

    private static void mappingToUpperCase(ArrayList<String> list) {
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println)
        ;
    }

    private static void mappingToUpperCaseInOneLine(ArrayList<String> list) {
        String result = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

    private static void mappingNumberToWords(ArrayList<Integer> list) {
        Map<Integer, String> numberToWordMap = Map.of(
                0, "Zero",
                1, "One",
                2, "Two",
                3, "Three",
                4, "Four",
                5, "Five",
                6, "Six",
                7, "Seven",
                8, "Eight",
                9, "Nine"
        );

        list.stream()
                .map(number -> numberToWordMap.getOrDefault(number, "Unknown"))
                .forEach(System.out::println);
    }

    private static void mappingNumberToBinary(ArrayList<Integer> list) {
        list.stream()
                .map(Integer::toBinaryString)
                .forEach(System.out::println);
    }


}
