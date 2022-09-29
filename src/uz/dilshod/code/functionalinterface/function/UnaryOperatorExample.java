package uz.dilshod.code.functionalinterface.function;

import java.util.Arrays;
import java.util.function.UnaryOperator;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = (s) -> s.concat("Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java11"));
    }
}
