package chapter23;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratingOverArrays {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int e : array) {
            System.out.println(e);
        }
        Integer[] boxed = {1, 2, 3};
        List<Integer> boxedIt = Arrays.asList(boxed);
        Iterator<Integer> fromBoxed1 = boxedIt.iterator();
    }
}
