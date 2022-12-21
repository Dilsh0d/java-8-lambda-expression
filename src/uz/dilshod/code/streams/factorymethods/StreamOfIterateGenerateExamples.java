package uz.dilshod.code.streams.factorymethods;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Stream API : Factory methods
 *
 *  of() - Creates a stream of certain values passed to this method.
 *      Example:
 *          Stream<String> stringStream = Stream.of("adam","dan","Julie");
 *
 *  generate() - Used to create infinite Streams.
 *      Example:
 *          Stream.iterate(1,x->x*2);
 *
 *  iterate() - Used to create infinite Streams.
 *      Example:
 *          Stream.generate(<Supplier>)
 */
public class StreamOfIterateGenerateExamples {

    public static void main(String[] args) {
        Stream<String> streamOf = Stream.of("Dilshod", "Jahon", "Javoh");
        streamOf.forEach(System.out::println);

        Stream.iterate(1, x-> x*2)
                .limit(10)
                .forEach(System.out::println);

        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(10)
                .forEach(System.out::println);

    }
}
