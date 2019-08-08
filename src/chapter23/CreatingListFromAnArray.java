package chapter23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingListFromAnArray {
    public static void main(String[] args) {
        String[] stringArray = {"foo", "bar", "baz"};
        List<String> stringList = Arrays.asList(stringArray);
        List<String> stringList1 = new ArrayList<String>(Arrays.asList(stringArray));

        int[] numbers1 = new int[3]; // Array for 3 int values, default value is 0
        int[] numbers2 = { 1, 2, 3 }; // Array literal of 3 int values
        int[] numbers3 = new int[] { 1, 2, 3 }; // Array of 3 int values initialized
        int[][] numbers4 = { { 1, 2 }, { 3, 4, 5 } }; // Jagged array literal
        int[][] numbers5 = new int[5][]; // Jagged array, one dimension 5 long
        int[][] numbers6 = new int[5][4]; // Multidimensional array: 5x4
    }
}
