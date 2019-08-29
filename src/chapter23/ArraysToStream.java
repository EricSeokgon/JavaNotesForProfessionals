package chapter23;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysToStream {
    public static void main(String[] args) {
        String[] arr = new String[]{"str1", "str2", "str3"};
        Stream<String> stream = Arrays.stream(arr);

        int[] intArr = {1, 2, 3};
        IntStream stream1 = Arrays.stream(intArr);

        int[] values = {1, 2, 3, 4};
        IntStream stream2 = Arrays.stream(values, 2, 4);

        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        Stream<String> stringStream = Stream.of("1", "2", "3");
        Stream<Double> doubleStream = Stream.of(new Double[]{1.0, 2.0});
    }
}
