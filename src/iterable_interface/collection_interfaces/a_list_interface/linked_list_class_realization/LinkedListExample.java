package iterable_interface.collection_interfaces.a_list_interface.linked_list_class_realization;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // add elements
        list.add("One");
        list.add("Two");
        list.add("Three");
        System.out.println(list); // [One, Two, Three]

        // add to the beginning and end
        list.addFirst("Zero");
        list.addLast("Four");
        System.out.println(list); // [Zero, One, Two, Three, Four]

        // getting first and last elements
        String firstElement = list.getFirst();
        String lastElement = list.getLast();
        System.out.println("First element: " + firstElement + " and last element: " + lastElement); // First element: Zero and last element: Four

        // remove first and last elements
        list.removeFirst();
        list.removeLast();
        System.out.println("List after removed first and last elements: " + list); // List after removed first and last elements: [One, Two, Three]

        // contains by condition
        boolean isContainsThree = list.contains("Three");
        boolean isContainsTen = list.contains("Ten");
        System.out.println("List contains Three: " + isContainsThree); // List contains Three: true
        System.out.println("List contains Ten: " + isContainsTen); // List contains Ten: false

        // list iteration
        System.out.println("Elements of list:");
        for (String item : list) {
            System.out.println(item); // Elements of list: One Two Three
        }

        // reverse
        System.out.println(list.reversed()); // [Three, Two, One]

        // remove element by index
        list.remove(1);
        System.out.println(list); // [One, Three]

        // add element by index
        list.add(1, "Two");
        System.out.println(list); // [One, Two, Three]

        // clone
//        @SuppressWarnings("unchecked")
//        LinkedList<String> cloneList = (LinkedList<String>) list.clone();
        LinkedList<String> cloneList = new LinkedList<>(list);
        System.out.println("Cloned list: " + cloneList); // Cloned list: [One, Two, Three]

        // get index of object
        int index = list.indexOf("One");
        System.out.println("Index of One is: " + index); // Index of One is: 0

        // remove all elements
        list.clear();
        System.out.println("List after method clear: " + list); // []

    }
}
