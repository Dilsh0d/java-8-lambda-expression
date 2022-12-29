package uz.dilshod.code.defaultstaticmethodinterface;

import java.util.List;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class InterfaceDefaultMethodExampleImpl implements InterfaceDefaultMethodExample {
    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (x, y) -> x * y);
    }

    @Override
    public int sizeOfList(List<Integer> integerList) {
        System.out.println("Inside of Impl Class!");
        return integerList.size();
    }
}
