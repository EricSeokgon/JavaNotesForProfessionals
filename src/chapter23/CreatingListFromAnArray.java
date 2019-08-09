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
        float[] boats = new float[5]; // Array of five 32-bit floating point numbers.
        double[] header = new double[] { 4.56, 332.267, 7.0, 0.3367, 10.0 };
// Array of five 64-bit floating point numbers.
        String[] theory = new String[] { "a", "b", "c" };
// Array of three strings (reference type).
        Object[] dArt = new Object[] { new Object(), "We love Stack Overflow.", new Integer(3) };
// Array of three Objects (reference type).
    }
}
