package uz.dilshod.code.streams.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class MaxUsingReduceExample {

    public static int findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (x, y) -> x > y ? x : y);
    }

    public static int findMaxValue2(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, Integer::max);
    }

    public static Optional<Integer> findMaxValue3(List<Integer> integerList) {
        return integerList.stream()
                .reduce(Integer::max);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
//        List<Integer> integerList = new ArrayList<>();

        System.out.println("Max value of list : "+ findMaxValue(integerList));
        System.out.println("Max value of list : "+ findMaxValue2(integerList));

        Optional<Integer> maxValue = findMaxValue3(integerList);

        if(maxValue.isPresent()) {
            System.out.println("Max value of list : " + maxValue.get());
        } else {
            System.out.println("Input list is empty.");
        }
    }
}
