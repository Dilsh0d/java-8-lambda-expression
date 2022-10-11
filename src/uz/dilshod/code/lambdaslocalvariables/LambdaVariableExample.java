package uz.dilshod.code.lambdaslocalvariables;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class LambdaVariableExample {

    public static void main(String[] args) {
        int  i = 0;

        Consumer<Integer> c1 = (i1) -> {
            System.out.println("Value is : " + i1);
        };

        c1.accept(10);
    }
}
