package chapter24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iterating {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Clementine", "Duran", "Mike"));
        //Version >= java SE 8
        names.forEach(System.out::println);

        names.parallelStream().forEach(System.out::println);
        //Version >= Java SE 5
        for (String name : names) {
            System.out.println(name);
        }
        //Version <= Java SE 5
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

    }
}
