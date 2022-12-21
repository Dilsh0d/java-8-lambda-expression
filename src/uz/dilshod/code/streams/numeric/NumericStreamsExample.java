package uz.dilshod.code.streams.numeric;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Numeric streams
 *
 * Represents the primitive values in a Stream
 *
 *      IntStream
 *      LongStream
 *      DoubleStream
 *
 */
public class NumericStreamsExample {

    public static int sumOfListNum(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (x, y) -> x + y);
    }

    public static int sumOfListIntStream() {
        return IntStream.rangeClosed(1,6)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6);

        System.out.println("Sum of N Numbers : " + sumOfListNum(integerList));

        System.out.println("Sum of N Numbers By IntStreams : " + sumOfListIntStream());
    }
}
