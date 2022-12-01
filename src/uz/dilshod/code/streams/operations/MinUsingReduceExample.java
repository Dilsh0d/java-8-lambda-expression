package uz.dilshod.code.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class MinUsingReduceExample {
    public static Optional<Integer> findMinValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce( (x, y) -> x < y ? x : y);
    }

    public static Optional<Integer> findMinValue2(List<Integer> integerList) {
        return integerList.stream()
                .reduce(Integer::min);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
//        List<Integer> integerList = new ArrayList<>();

        System.out.println("Min1 value of list : "+ findMinValue(integerList).get());

        Optional<Integer> minValue = findMinValue2(integerList);

        if(minValue.isPresent()) {
            System.out.println("Min2 value of list : " + minValue.get());
        } else {
            System.out.println("Input list is empty.");
        }
    }
}
