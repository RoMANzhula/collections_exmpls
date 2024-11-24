package iterable_interface.collection_interfaces.a_list_interface.linked_list_class_realization;

import java.util.*;

public class LinkedListCollectionsCommonMethods {

    public static void main(String[] args) {
        // sort elements by alphabet
        LinkedList<String> fruits = new LinkedList<>(Arrays.asList("Banana", "Orange", "Apple", "Melon"));
        Collections.sort(fruits);
        System.out.println(fruits); // [Apple, Banana, Melon, Orange]

        // reverse the order of elements int the list
        Collections.reverse(fruits);
        System.out.println(fruits); // [Orange, Melon, Banana, Apple]

        // shuffle the elements in the list in random order
        Collections.shuffle(fruits);
        System.out.println(fruits); // alot of cases

        // change the places of the elements with the indicated indices
        LinkedList<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 3, 100));
        Collections.swap(listOfNumbers, 0, 3);
        System.out.println(listOfNumbers); // [10, 2, 3, 1]

        // get max and min numbers of our list
        int max = Collections.max(listOfNumbers);
        int min = Collections.min(listOfNumbers);
        System.out.println("Min number of list: " + min + " and max number: " + max);

        // rotate elements from the specified element (works like a carousel)
        fruits.add("Kiwi");
        Collections.sort(fruits); // [Apple, Banana, Kiwi, Melon, Orange]
        Collections.rotate(fruits, 1);
        System.out.println(fruits); // [Orange, Apple, Banana, Kiwi, Melon]

        // returns count of element frequency in the list
        LinkedList<Integer> listOfNumbersFrequency = new LinkedList<>(Arrays.asList(1, 2, 3, 1, 1, 1));
        int frequency = Collections.frequency(listOfNumbersFrequency, 1);
        System.out.println(frequency); // 4

        // fill our list as one element instead all
        LinkedList<String> fruitsFilled = new LinkedList<>(Arrays.asList("Banana", "Orange", "Apple", "Melon"));
        Collections.fill(fruitsFilled, "Cucumber");
        System.out.println(fruitsFilled); // [Cucumber, Cucumber, Cucumber, Cucumber]

        // returns unmodifiable list
        LinkedList<String> listTwo = new LinkedList<>(Arrays.asList("No", " modify", " this", " list!"));
        List<String> unmodifiableList = Collections.unmodifiableList(listTwo);
        System.out.println(unmodifiableList); // [No,  modify,  this,  list!]
//        unmodifiableList.add("I'm UnsupportedOperationException."); // get UnsupportedOperationException

        // copy all elements to another list (to, from)
        LinkedList<String> sourceList = new LinkedList<>(Arrays.asList("One", "Two", "Three"));
        LinkedList<String> destinationList = new LinkedList<>(Arrays.asList("Six", "Seven", "Eight"));
        Collections.copy(destinationList, sourceList);
        System.out.println(destinationList); // [One, Two, Three]

        // get index of sublist
        LinkedList<String> subFruit = new LinkedList<>(Arrays.asList("Apple", "Banana"));
        int indexOfSubList = Collections.indexOfSubList(fruits, subFruit);
        System.out.println("Sublist found at index: " + indexOfSubList); // Sublist found at index: 1
    }

}
