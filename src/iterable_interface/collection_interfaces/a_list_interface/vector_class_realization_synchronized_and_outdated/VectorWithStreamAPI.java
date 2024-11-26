package iterable_interface.collection_interfaces.a_list_interface.vector_class_realization_synchronized_and_outdated;

import java.util.Arrays;
import java.util.Vector;

public class VectorWithStreamAPI {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(Arrays.asList(1, 2, 3));
        vector.add(4);

            // create stream
        createStream(vector);
        createParallelStream(vector);



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

}
