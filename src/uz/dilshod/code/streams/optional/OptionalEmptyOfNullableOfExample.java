package uz.dilshod.code.streams.optional;

import java.util.Optional;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class OptionalEmptyOfNullableOfExample {

    public static Optional<String> ofNullable() {
//        return Optional.ofNullable(null); does not give exception
       return Optional.ofNullable("Hey Of Nullable!");
    }

    public static Optional<String> of() {
//        return Optional.of(null); give exception
        return Optional.of("Hey Of!");
    }

    public static Optional<String> empty() {
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println("Optional Of Nullable : "+ ofNullable().get());
        System.out.println("Optional Of  : "+ of().get());
        System.out.println("Optional Empty  : "+ empty().get());
    }
}
