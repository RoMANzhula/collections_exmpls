package iterable_interface.collection_interfaces.a_list_interface.vector_class_realization_synchronized_and_outdated;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorCollectionsCommonMethods {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(Arrays.asList(7, 11, 9, 24));

        // sorted
        System.out.println("Before sorted: " + vector); // Before sorted: [7, 11, 9, 24]
        Collections.sort(vector);
        System.out.println("Vector after sorted: " + vector); // Vector after sorted: [7, 9, 11, 24]

        // replace all elements
        vector.add(7);
        System.out.println("Before replace all: " + vector); // Before replace all: [7, 9, 11, 24, 7]
        Collections.replaceAll(vector, 7,  4);
        System.out.println("Vector after replace all: " + vector); // Vector after replace all: [4, 9, 11, 24, 4]

        // binary index search (working only with sorted collections)
        Collections.sort(vector);
        System.out.println("Vector after sorted: " + vector);
        int index = Collections.binarySearch(vector, 11);
        System.out.println("Index of element 11: " + index); // Index of element 11: 3

        // swapping
        System.out.println("Vector before swap: " + vector); // Vector before swap: [4, 4, 9, 11, 24]
        Collections.swap(vector, 0, 3);
        System.out.println("Vector after swap: " + vector); // Vector after swap: [11, 4, 9, 4, 24]

        // rotate
        System.out.println("Vector before rotate: " + vector); // Vector before rotate: [11, 4, 9, 4, 24]
        Collections.rotate(vector, 2);
        System.out.println("Rotate to 2 positions: " + vector); // Rotate to 2 positions: [4, 24, 11, 4, 9]

        // shuffle
        System.out.println("Before shuffle: " + vector); // Before shuffle: [4, 24, 11, 4, 9]
        Collections.shuffle(vector);
        System.out.println("Vector after shuffle: " + vector); // Vector after shuffle: [4, 4, 24, 11, 9] (can be different elements` positions)

        // create unmodifiable list
        List<Integer> unmodifiableList = Collections.unmodifiableList(vector);
        System.out.println("Unmodifiable list: " + unmodifiableList); // Unmodifiable list: [4, 4, 24, 11, 9]
        // try add new element
        // unmodifiableList.add(100); // we have UnsupportedOperationException

        // find max/min value
        int max = Collections.max(vector);
        int min = Collections.min(vector);
        System.out.println("Max value of vector: " + max + " and min value: " + min); // Max value of vector: 24 and min value: 4

    }

}
