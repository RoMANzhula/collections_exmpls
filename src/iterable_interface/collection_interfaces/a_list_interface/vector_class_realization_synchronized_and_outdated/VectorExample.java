package iterable_interface.collection_interfaces.a_list_interface.vector_class_realization_synchronized_and_outdated;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // add elements in tail
        vector.add("One");
        vector.add("Two");
        vector.add("Three");
        System.out.println("Vector after added: " + vector); // Vector after added: [One, Two, Three]

        // get by index
        String elementByIndex = vector.get(1);
        String elementAt = vector.elementAt(2);
        System.out.println("Element by index: " + elementByIndex); // Element by index: Two
        System.out.println("Element at: " + elementAt); // Element at: Three

        // get first element
        String firstElement = vector.firstElement();
        System.out.println("First element: " + firstElement); // First element: One

        // get last element
        String lastElement = vector.lastElement();
        System.out.println("Last element: " + lastElement); // Last element: Three

        // get capacity
        int capacity = vector.capacity();
        System.out.println("Vector capacity: " + capacity); // Vector capacity: 10

        // get size
        int size = vector.size();
        System.out.println("Vector size: " + size); // Vector size: 3

        // contain
        boolean contain = vector.contains("Two");
        System.out.println("Is vector have element Two?: " + contain); // true

        // remove by index
        vector.remove(1);
        System.out.println("Deleted element Two by index. Vector now: " + vector); // Deleted element Two by index. Vector now: [One, Three]

        // remove by object
        vector.add(1, "Four");
        System.out.println("Vector now: " + vector); // Vector now: [One, Four, Three]
        vector.remove("One");
        System.out.println("Vector after deleted One: " + vector); // Vector after deleted One: [Four, Three]

        // reverse
        vector.add("Two");
        vector.add("One");
        System.out.println(vector); // [Four, Three, Two, One]
        System.out.println("Vector after reversed: " + vector.reversed()); // Vector after reversed: [One, Two, Three, Four]

        // clear
        vector.clear();
        System.out.println("Vector after clear: " + vector); // Vector after clear: []

        // remove first/last
        vector.add("One");
        vector.add("Two");
        vector.add("Three");
        System.out.println(vector); // [One, Two, Three]
        vector.removeLast();
        System.out.println("Vector after deleted last: " + vector); // Vector after deleted last: [One, Two]
        vector.removeFirst();
        System.out.println("Vector after deleted first element: " + vector); // Vector after deleted first element: [Two]

    }

}
