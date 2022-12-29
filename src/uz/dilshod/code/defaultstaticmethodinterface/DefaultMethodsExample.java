package uz.dilshod.code.defaultstaticmethodinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class DefaultMethodsExample {

    public static void main(String[] args) {
        //  Sort the list names in alphabetical order
        List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");
        Collections.sort(stringList);
        System.out.println("Sorted list using Collections.sort() : "+ stringList);

        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using List.sort() : "+ stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sorted list using List.sort() : "+ stringList);
    }
}
