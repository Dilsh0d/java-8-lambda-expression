package uz.dilshod.code.methodreference;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class FunctionMethodReferenceExample {
    static Function<String,String> toUpperCaseLambda = (s) -> s.toUpperCase();

    static Function<String,String> toUpperCaseMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("java 8"));
        System.out.println(toUpperCaseMethodReference.apply("java 18"));
    }
}
