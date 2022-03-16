package uz.dilshod.code.imperativevsdeclarative;

import java.util.stream.IntStream;

/**
 * This is example show Imperative and Declarative programming language style difference
 */
public class ImperativeVsDeclarativeProgrammingLanguage {

    /**
     * This is example prints sum of numbers [1,2,..,100]
     */
    public static void main(String[] args) {
        /**
         * Imperative style of programming
         */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Imperative style result at the Java: " + sum);

        /**
         * Declarative style of programming
         */
        int sum1 = 0;
        sum1 = IntStream
                .rangeClosed(1,100)
                .sum();
        System.out.println("Declarative style  result at the Java: " + sum1);
    }
}
