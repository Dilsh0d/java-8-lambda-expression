package uz.dilshod.code.streams.optional;

import java.util.Optional;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class OptionalPresentExample {

    public static void main(String[] args) {
        // isPresent
        Optional<String> optional = Optional.ofNullable("Hey I'am Hero!");
        System.out.println("isPresent() : " + (optional.isPresent() ? optional.get() : ""));

        if(optional.isPresent()) {
            System.out.println(optional.get());
        }

        // ifPresent
        optional.ifPresent(s -> System.out.println("IfPresent : " + s));
    }
}
