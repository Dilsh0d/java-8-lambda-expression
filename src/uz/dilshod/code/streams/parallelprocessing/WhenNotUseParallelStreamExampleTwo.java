package uz.dilshod.code.streams.parallelprocessing;

import java.util.stream.IntStream;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class WhenNotUseParallelStreamExampleTwo {

    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000)
                .forEach(sum::performSum);

        System.out.println("Sum of total : " + sum.getTotal());

        Sum sum1 = new Sum();
        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach(sum1::performSum);


        System.out.println("Sum of total by parallel: " + sum1.getTotal());
    }
}
