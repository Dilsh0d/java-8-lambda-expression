package uz.dilshod.code.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This is example show Imperative and Declarative programming language style difference
 */
public class ImperativeVsDeclarativeProgrammingLanguage2 {
    /**
     * This is example print unique numbers from List
     */
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,1,2,3,3,3,4,4,5,6,6,7,7,8,9,10,10,11);

        /**
         * Imperative style of programming
         */
        List<Integer> uniqueNumbers = new ArrayList<>();
        for(Integer number:numberList){
            if(!uniqueNumbers.contains(number)){
                uniqueNumbers.add(number);
            }
        }
        System.out.println("Imperative style result at the Java: " +uniqueNumbers);

        /**
         * Declarative style of programming
         */

        List<Integer> uniqueNumbers1 = numberList
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Declarative style  result at the Java: " + uniqueNumbers1);
    }
}
