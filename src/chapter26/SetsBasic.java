package chapter26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetsBasic {
    public static void main(String[] args) {
        //Set<T> set = new HashSet<T>();
        //TreeSet<T> sortedSet = new TreeSet<T>();
        Set<Integer> set = new HashSet<Integer>(); // Creates an empty Set of Integers
        set.add(12); // - Adds element 12 to the set
        set.add(13); // - Adds element 13 to the set
        System.out.println(set);
        set.clear(); //Removes all objects from the collection.
        System.out.println(set);

        //HashSet - Random Sorting
        Set<String> setStr = new HashSet<>();
        setStr.add("Banana");
        setStr.add("Banana");
        setStr.add("Apple");
        setStr.add("Strawberry");
        System.out.println(setStr);
        //LinkedHashSet - Insertion Order
        Set<String> setStr2 = new LinkedHashSet<>();
        setStr2.add("Banana");
        setStr2.add("Banana");
        setStr2.add("Apple");
        setStr2.add("Strawberry");
        System.out.println(setStr2);

    }
}
