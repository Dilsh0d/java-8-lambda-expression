package uz.dilshod.code.methodreference;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class MethodReferenceExample {


    public static void main(String[] args) {

        Function<String,String> toUpperCaseWithLamda = (s) -> s.toUpperCase();
        Function<String,String> toUpperCaseWithMethodReference = String::toUpperCase;

        System.out.println("Upper case with Lamda :" + toUpperCaseWithLamda.apply("Java 11"));
        System.out.println("Upper case with Lamda :" + toUpperCaseWithMethodReference.apply("Java 18"));
    }
}
