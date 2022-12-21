package uz.dilshod.code.streams.numeric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Numeric Streams: Boxing and UnBoxing
 *
 *  Boxing()
 *      Converting a primitive type to Wrapper Class type
 *      Example: Converting an int (primitive) to Integer(wrapper)
 *
 *  UnBoxing()
 *      Converting a Wrapper Class type to primitive type.
 *      Example: Converting an Integer(wrapper) to int(primitive)
 *
 *
 */
public class NumericStreamsBoxingUnboxingExample {

    public static List<Integer> boxing() {
         return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList) {
        return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing :  " + boxing());

        System.out.println("UnBoxing  :  " + unBoxing(boxing()));
    }
}
