package uz.dilshod.code.lambdaslocalvariables;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class LambdaVariableExample2 {

    static int value = 4;

    public static void main(String[] args) {

         // local variable
        Consumer<Integer> c1 = (i) -> {
            System.out.println(value+i);
        };

        value = 6;

        c1.accept(4);
    }
}
