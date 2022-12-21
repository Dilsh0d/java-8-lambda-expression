package uz.dilshod.code.streams.numeric;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Numeric Stream ranges:
 *
 *  IntStream
 *  IntStream.range(1,50) -> Returns an IntStream of 49 elements from 1 to 49.
 *  IntStream.rangeClosed(1,50) -> Returns an IntStream of 50 elements from 1 to 49.
 *
 *  LongStream
 *  LongStream.range(1,50) -> Returns an IntStream of 49 elements from 1 to 49.
 *  LongStream.rangeClosed(1,50) -> Returns an IntStream of 50 elements from 1 to 49.
 *
 *  DoubleStream
 *  - It does not support the range() and rangeClosed().
 */
public class NumericStreamsRangeRangeClosedCountForEachExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println("Count of InStream.range(1,50) = "+ intStream.count());

        IntStream.range(1,50).forEach(value -> System.out.print(value + ","));
        System.out.println();
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value + ","));

        System.out.println();
        LongStream longStream = LongStream.range(1,50);
        System.out.println("Count of LongStream.range(1,50) = "+ longStream.count());

        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value + ","));

        System.out.println();
        IntStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.print(value + ","));;
    }
}
