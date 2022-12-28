package uz.dilshod.code.streams.parallelprocessing;

import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Parallel Processing example
 *
 * How Parallel Stream works ?
 *      Parallel Stream uses the Fork/Join framework that got introduced in Java 7.
 *
 * How many Threads are created ?
 *      Number of threads created == n umber of processors available in the machine.
 *
 */
public class ParallelProcessingExample {

    public static long checkPerformance(Supplier<Integer> supplier, int numberOfTimes) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    public static int sumSequentialStreamList() {
        return IntStream.rangeClosed(1, 1000000)
                .sum();
    }

    public static int sumParallelStreamList() {
        return IntStream.rangeClosed(1, 1000000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
//        System.out.println("Sum [1..100000] : "+ sumSequentialStreamList());
//        System.out.println("Parallel sum [1..100000] : "+ sumParallelStreamList());

        System.out.println("Available process : "+Runtime.getRuntime().availableProcessors());

        System.out.println("Sequential sum of Stream : "+checkPerformance(ParallelProcessingExample::sumSequentialStreamList,20));

        System.out.println("Parallel sum of Stream : "+checkPerformance(ParallelProcessingExample::sumParallelStreamList,20));
    }
}
