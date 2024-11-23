package iterable_interface.collection_interfaces.a_list_interface.array_list_class_realization;

import java.util.*;
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

                    // sorting
        sortByAlphabet(fruits); // Apple Banana Melon Orange (each in new row)
        sortByLength(fruits); // Apple Melon Banana Orange (each in new row)
        sortByValue(numbers); // 1 1 2 2 3 4 5 7 8 (each in new row)
        System.out.println(sortByEvenNumber(numbers)); // [2, 2, 4, 8]

                    // checking conditions
        checkListElementBeginChar(fruits, "A"); // Contains element(s) starting with A: true
        checkListHasNumber(numbers, 2); // The list includes number: 2


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

                                // SORT

    private static void sortByAlphabet(ArrayList<String> list) {
        list.stream()
                .sorted()
                .forEach(System.out::println)
        ;
    }

    private static void sortByLength(ArrayList<String> list) {
        list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println)
        ;
    }

    private static void sortByValue(ArrayList<Integer> list) {
        list.stream()
                .sorted()
                .forEach(System.out::println)
        ;
    }

    private static List<Integer> sortByEvenNumber(ArrayList<Integer> list) {
        return list.stream()
                .filter(number -> number % 2 == 0)
                .sorted()
                .collect(Collectors.toList())
        ;
    }

                            // CHECK CONDITIONS

    private static void checkListElementBeginChar(ArrayList<String> list, String str) {
        boolean hasElement = list.stream()
                .anyMatch(element -> element.startsWith(str))
        ;

        System.out.println("Contains element(s) starting with " + str + ": " + hasElement);
    }

    private static void checkListHasNumber(ArrayList<Integer> list, int num) {
        boolean hasNumber = list.stream()
                .anyMatch(element -> element == num)
        ;

        if (hasNumber) {
            System.out.println("The list includes number: " + num);
        } else {
            System.out.println("The list not includes number: " + num);
        }
    }


}
