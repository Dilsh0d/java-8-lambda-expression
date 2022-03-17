package uz.dilshod.code.lambdaexpression;

import java.util.Comparator;

/**
 * Lambda expression example with Comparator Interface
 */
public class LambdaExpression3 {
    /**
     * We are showing Legacy and Functional Interface difference this example
     * with Comparator interface
     */
    public static void main(String[] args) {
        /**
         * Legacy Java 8 code style
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // if o1==o2 then 0
                                         // if o1>o2  then 1
                                         // if o1<o2  then -1
            }
        };

        System.out.println("Compare two numbers result : " + comparator.compare(7,5));

        /**
         * Lambda syntax code style
         * ()->{}
         */

        Comparator<Integer> comparatorLambda = (Integer a,Integer b) -> {return a.compareTo(b);};
        Comparator<Integer> comparatorLambdaShort = (a,b) -> a.compareTo(b);

        System.out.println("Compare two numbers result : " + comparatorLambda.compare(7,5));
        System.out.println("Compare two numbers result : " + comparatorLambdaShort.compare(7,5));

    }
}
