package chapter24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingOverMap {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Clementine");
        names.put(2, "Duran");
        names.put(3, "Mike");

        //Version >= Java SE 8
        names.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));

        //Version >= Java SE 5
        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //Iterating over only keys
        for (Integer key : names.keySet()) {
            System.out.println(key);
        }

        //Iterating over only value
        for (String value : names.values()) {
            System.out.println(value);
        }

        //Version < Java SE 5
        Iterator entries = names.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
