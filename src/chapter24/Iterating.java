package chapter24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iterating {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Clementine", "Duran", "Mike"));
        //java SE 8
        names.forEach(System.out::println);

    }
}
