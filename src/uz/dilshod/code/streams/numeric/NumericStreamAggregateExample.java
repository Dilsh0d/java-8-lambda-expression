package uz.dilshod.code.streams.numeric;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Numeric Stream - Aggregate Functions
 *
 *  sum()
 *  max()
 *  min()
 *  average()
 *
 */
public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum is 1..50 number = "+ sum);

        OptionalInt max = IntStream.rangeClosed(1,50).max();
        System.out.println("Max numbers are 1..50 number = " + (max.isPresent() ? max.getAsInt() : 0));

        OptionalLong min = LongStream.rangeClosed(37,50).min();
        System.out.println("Min numbers are 1..50 number = " + (min.isPresent() ? min.getAsLong() : 0));

        OptionalDouble average = IntStream.rangeClosed(1,50).average();
        System.out.println("Average is 1..50 number = " + (average.isPresent() ? average.getAsDouble() : 0));
    }
}
