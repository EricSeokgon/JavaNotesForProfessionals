package chapter28;

import java.util.HashMap;
import java.util.Map;

public class MapsTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "First element");
        map.get(1); // => First element
        map.get(2); // => null
        map.getOrDefault(2, "Default element"); // => Default element

    }
}
