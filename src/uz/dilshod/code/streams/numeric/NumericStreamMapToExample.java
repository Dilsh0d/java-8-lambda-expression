package uz.dilshod.code.streams.numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Numeric Streams - mapToObj(), mapToLong(), mapDouble()
 *
 *   mapToObj -> Convert a each element numeric stream to some Object.
 *   mapToLong -> Convert a each element numeric stream to a Long Stream.
 *   mapDouble -> Convert a each element numeric stream to a Double Stream.
 */
public class NumericStreamMapToExample {

    public static List<Integer> mapToObject() {
        return IntStream.rangeClosed(1,5)
                .mapToObj((i)-> Integer.valueOf(i))
                .collect(Collectors.toList());

    }

    public static long mapToLong() {
        return IntStream.rangeClosed(1,5)
                .mapToLong((i)-> i)
                .sum();

    }

    public static double mapToDouble() {
        return IntStream.rangeClosed(1,5)
                .mapToDouble((i)->i)
                .sum();

    }

    public static void main(String[] args) {
        System.out.println("Map to object : "+mapToObject());
        System.out.println("Map to long : "+mapToLong());
        System.out.println("Map to double : "+mapToDouble());
    }
}
