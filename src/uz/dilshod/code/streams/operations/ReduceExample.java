package uz.dilshod.code.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Stream API : reduce()
 *
 * reduce - This is a terminal operation. Used to reduce the contents of a stream to a single value.
 *
 * It takes two parameters as an input.
 *  First parameters - default or initial value
 *  Second parameters - BinaryOperator<T>
 *
 */
public class ReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (a, b) -> a * b);

    }

    public static Optional<Integer> performMultiplicationWithoutIdentifier(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a, b) -> {
                    System.out.printf("a = %d, b = %d ",a,b);
                    System.out.println();
                    return a * b;
                });

    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,4,3,5,7);

        System.out.println(performMultiplication(integers));
        System.out.println(performMultiplicationWithoutIdentifier(integers).get());
    }
}
