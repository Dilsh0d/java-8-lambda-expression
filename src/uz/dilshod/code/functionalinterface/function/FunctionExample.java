package uz.dilshod.code.functionalinterface.function;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class FunctionExample {

    static Function<String,String> function = (name) -> name.toUpperCase();

    static Function<String,String> addSomeString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("Result is :  " + function.apply("java9"));

        System.out.println("Result of and then is :  " + function.andThen(addSomeString).apply("java9"));
        System.out.println("Result of compose is :  " + function.compose(addSomeString).apply("java9"));
    }
}
