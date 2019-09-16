package chapter24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratingOverSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>(Arrays.asList("Clementine", "Duran", "Mike"));

        //Version >= Java SE 8
        names.forEach(System.out::println);

        //Version >= Java SE 5
        for (Iterator<String> iterator = names.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }

        for (String anme : names) {
            System.out.println(names);
        }

        //Version < Java Se 5
        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

