package uz.dilshod.code.defaultstaticmethodinterface;

import java.util.Arrays;
import java.util.List;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class InterfaceDefaultMethodMainExample {

    public static void main(String[] args) {
        InterfaceDefaultMethodExample  multiplier = new InterfaceDefaultMethodExampleImpl();
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        System.out.println("Result is : "+ multiplier.multiply(integerList));
        System.out.println("Default method size is : "+ multiplier.sizeOfList(integerList));
        System.out.println("List is empty: "+ InterfaceDefaultMethodExample.isEmpty(integerList));
    }
}
