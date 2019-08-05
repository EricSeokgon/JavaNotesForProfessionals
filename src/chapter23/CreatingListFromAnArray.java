package chapter23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingListFromAnArray {
    public static void main(String[] args) {
        String[] stringArray = {"foo", "bar", "baz"};
        List<String> stringList = Arrays.asList(stringArray);
        List<String> stringList1 = new ArrayList<String>(Arrays.asList(stringArray));
    }
}
