package iterable_interface.collection_interfaces.a_list_interface.vector_class_realization_synchronized_and_outdated;

import java.util.Arrays;
import java.util.Optional;
import java.util.Vector;
import java.util.stream.Collectors;

public class VectorWithStreamAPI {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(Arrays.asList(1, 2, 3));
        vector.add(4);

            // create stream
        createStream(vector); // 1 2 3 4
        createParallelStream(vector); // 3 4 2 1

            // filter
        filteredVector(vector, 1); // Filtered vector: [2, 3, 4]

            // mapping
        mappedVectorDoubling(vector); // Mapped vector: [2, 4, 6, 8]

            // sorting
        sortedVector(vector); // Sorted vector: [1, 2, 3, 4]

            // find max and min
        getMaxValue(vector); // Max value of vector: 4
        getMinValue(vector); // Min value of vector: 1

    }

                                // CREATE STREAM

    private static void createStream(Vector<Integer> vector) {
        vector.stream()
                .forEach(System.out::println)
        ;
    }

    private static void createParallelStream(Vector<Integer> vector) {
        vector.parallelStream()
                .forEach(System.out::println)
        ;
    }

                                // FILTER

    private static void filteredVector(Vector<Integer> vector, int condition) {
        Vector<Integer> filteredVector = vector.stream()
                .filter(number -> number > condition)
                .collect(Collectors.toCollection(Vector::new))
        ;

        System.out.println("Filtered vector: " + filteredVector);
    }

                                // MAP

    private static void mappedVectorDoubling(Vector<Integer> vector) {
        Vector<Integer> mappedVector = vector.stream()
                .map(element -> element * 2)
                .collect(Collectors.toCollection(Vector::new))
        ;

        System.out.println("Mapped vector: " + mappedVector);
    }

                                // SORT

    private static void sortedVector(Vector<Integer> vector) {
        Vector<Integer> sortedVector = vector.stream()
                .sorted()
                .collect(Collectors.toCollection(Vector::new))
        ;

        System.out.println("Sorted vector: " + sortedVector);
    }

                                // FIND MAX AND MIN

    private static void getMaxValue(Vector<Integer> vector) {
        Optional<Integer> max = vector.stream()
                .max(Integer::compareTo)
        ;

        max.ifPresent(val -> System.out.println("Max value of vector: " + val));
    }

    private static void getMinValue(Vector<Integer> vector) {
        Optional<Integer> min = vector.stream()
                .min(Integer::compareTo)
        ;

        min.ifPresent(val -> System.out.println("Min value of vector: " + val));
    }

}
