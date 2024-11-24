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

                    // counting elements
        countElementsStringByCondition(fruits, "B"); // Elements starting with _B_: 1
        countElementNumberByCondition(numbers, 1); // Count of element _1_ = 2

                    // searching elements
        findFirstElementStringByCondition(fruits, "M"); // Melon
        findAnyElementNumbersByCondition(numbers, 1); // 1

                    // grouping elements
        groupedByNumberOfLetterInWord(fruits, 0); // A : [Apple, Avocado] B : [Banana] M : [Melon, Mango] O : [Orange]
        groupedByNumber(numbers); // 1 : [1, 1] 2 : [2, 2] 3 : [3] 4 : [4] 5 : [5] 7 : [7] 8 : [8]

                    // collecting
        collectStringToRowWithComa(fruits, ", "); // Banana, Orange, Apple, Melon, Avocado, Mango
        collectNumberToRowWithComa(numbers, "| "); // 1| 2| 5| 3| 8| 1| 7| 2| 4

                    // aggregation of data
        getTotalCharsLength(fruits); // Total length of all strings: 34
        getTotalSumAllNums(numbers); // Total sum of all numbers: 33
        getAverageAllNums(numbers); // Average of all numbers: OptionalDouble[3.67]

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

                            // COUNTING ELEMENTS

    private static void countElementsStringByCondition(ArrayList<String> list, String str) {
        long countElement = list.stream()
                .filter(element -> element.startsWith(str))
                .count()
        ;

        System.out.println("Elements starting with _" + str + "_: " + countElement);
    }

    private static void countElementNumberByCondition(ArrayList<Integer> list, int num) {
        long countElement = list.stream()
                .filter(element -> element == num)
                .count()
        ;

        System.out.println("Count of element _" + num + "_ = " + countElement);
    }

                            // SEARCHING ELEMENTS

    private static void findFirstElementStringByCondition(ArrayList<String> list, String str) {
        list.stream()
                .filter(element -> element.startsWith(str))
                .findFirst()
                .ifPresent(System.out::println)
        ;
    }

    private static void findAnyElementNumbersByCondition(ArrayList<Integer> list, int num) {
        list.stream()
                .filter(element -> element == num)
                .findAny()
                .ifPresent(System.out::println)
        ;
    }

                            // GROUPING ELEMENTS
    private static void groupedByNumberOfLetterInWord(ArrayList<String> list, int numOfElementInWord) {
        list.add("Avocado");
        list.add("Mango");

        Map<Character, List<String>> groupedByNumLetter = list.stream()
                .collect(Collectors.groupingBy(element -> element.charAt(numOfElementInWord)))
        ;

        groupedByNumLetter.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }

    private static void groupedByNumber(ArrayList<Integer> list) {
        Map<Integer, List<Integer>> grouped = list.stream()
                .collect(Collectors.groupingBy(element -> element))
        ;

        grouped.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }

                                // COLLECTING ELEMENTS

    private static void collectStringToRowWithComa(ArrayList<String> list, String separator) {
        String result = list.stream()
                .collect(Collectors.joining(separator));

        System.out.println(result);
    }

    private static void collectNumberToRowWithComa(ArrayList<Integer> list, String separator) {
        String result = list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(separator));

        System.out.println(result);
    }

                                // AGGREGATION OF DATA

    private static void getTotalCharsLength(ArrayList<String> list) {
        int totalLength = list.stream()
                .mapToInt(String::length)
                .sum()
                ;

        System.out.println("Total length of all strings: " + totalLength);
    }

    private static void getTotalSumAllNums(ArrayList<Integer> list) {
        long totalSum = list.stream()
                .mapToInt(Integer::intValue)
                .sum()
                ;

        System.out.println("Total sum of all numbers: " + totalSum);

    }

    private static void getAverageAllNums(ArrayList<Integer> list) {
        OptionalDouble average = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                ;

        if (average.isPresent()) {
//            System.out.println("Average of all numbers: " + String.format("%.2f", average)); // if we use primitive double
            double roundedAverage = Math.round(average.getAsDouble() * 100.0) / 100.0; // for 3 elements after dot *1000.0 /1000.00
            System.out.println("Average of all numbers (rounded): " + roundedAverage);
        } else {
            System.out.println("The list is empty. No average calculated.");
        }

    }

}
