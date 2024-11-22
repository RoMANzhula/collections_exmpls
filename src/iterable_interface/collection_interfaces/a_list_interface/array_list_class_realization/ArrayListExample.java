package iterable_interface.collection_interfaces.a_list_interface.array_list_class_realization;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // method add elements
        list.add("Java");
        list.add("C++");
        list.add("C#");

        // method add new element by index
        list.add(1, "JavaScript"); // between Java(0) and C++(moves to index 2)

        // method get element by index
        System.out.println("Element with index 2 is: " + list.get(2)); // C++
        System.out.println("Element with index 1 is: " + list.get(1)); // JavaScript
        System.out.println("Element with index 0 is: " + list.get(0)); // Java

        // method delete element by index (in our case it's "C#")
        list.remove(3);

        // method checking for the presence of an element
        System.out.println("Is there element C++ in our list?:_" + list.contains("C++")); // true
        System.out.println("Is there element C# in our list?:_" + list.contains("C#")); // false

        // method get size of our list (analog length() in an array)
        System.out.println("The size of our list: " + list.size()); // returns 3 because we removed one element

        // iterating over all elements of the list
        System.out.println("List elements:");
        for (String elementOFList : list) {
            System.out.println(elementOFList);
        }

        // checking is empty our list
        System.out.println("Our list is empty? - " + list.isEmpty() + ". Because his size is: " + list.size());

        // method removeAll() - remove all elements from general list via a secondary list
        ArrayList<String> listForRemoveFromGeneralList = new ArrayList<>(Arrays.asList("Java", "JavaScript"));
        list.removeAll(listForRemoveFromGeneralList);
        System.out.println("List's size after method removeAll() is:_" + list.size()); // 1

        // method clear our list (all elements deleted)
        list.clear();
        System.out.println("List size after method clear() is:_" + list.size()); // 0

    }

}

