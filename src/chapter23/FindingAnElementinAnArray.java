package chapter23;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindingAnElementinAnArray {
    public static void main(String[] args) {
        String[] strings = {"A", "B", "C"};
        int[] ints = {1, 2, 3, 4};

        int index = Arrays.binarySearch(strings, "A");
        int index2 = Arrays.binarySearch(ints, 1);

        int arraysIx = Arrays.asList(strings).indexOf("A");
        int arraysIx2 = Arrays.asList(ints).indexOf(1);

        int istreamIx = IntStream.range(0, strings.length)
                .filter(i->"A".equals(strings[i]))
                .findFirst()
                .orElse(-1);
    }
}
