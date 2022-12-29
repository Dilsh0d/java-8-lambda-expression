package uz.dilshod.code.defaultstaticmethodinterface;

import java.util.List;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public interface InterfaceDefaultMethodExample {

    int multiply(List<Integer> integerList);

    default int sizeOfList(List<Integer> integerList) {
        System.out.println("Inside of Default Interface!");
        return integerList.size();
    }

    static boolean isEmpty(List<Integer> integerList) {
        return integerList != null && integerList.size() > 0;
    }
}
