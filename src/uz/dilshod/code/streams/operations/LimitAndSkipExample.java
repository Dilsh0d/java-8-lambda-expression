package uz.dilshod.code.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Stream API : limit() and skip()
 *
 *  These two function helps tp create a sub-stream
 *
 *      limit(n) - limits the "n" numbers of elements to be processed in the stream
 *      skip(n) - skips the n number of elements from the stream
 */
public class LimitAndSkipExample {

    public static Optional<Integer> limit(List<Integer> integers) {
        return integers.stream()
                .limit(2)
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skip(List<Integer> integers) {
        return integers.stream()
                .skip(3)
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);

        Optional<Integer> limitResult = limit(integers);
        if(limitResult.isPresent()) {
            System.out.println("The limit result is : "+ limitResult.get());
        } else {
            System.out.println("No input is passed!");
        }

        Optional<Integer> skipResult = skip(integers);
        if(skipResult.isPresent()) {
            System.out.println("The skip result is : "+ skipResult.get());
        } else {
            System.out.println("No input is passed!");
        }
    }
}
