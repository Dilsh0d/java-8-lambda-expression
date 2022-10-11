package uz.dilshod.code.methodreference;

import uz.dilshod.code.functionalinterface.data.Student;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class ConstructorReferenceExample {

    // Example
    static Supplier<Student> studentSupplier = Student::new;

    static Function<String,Student> studentFunction = Student::new;

    /**
     * Class_name::new
     */
    public static void main(String[] args) {

        System.out.println(studentSupplier.get());
        System.out.println(studentFunction.apply("Dilsh0d"));

        // Invalid
        // Student student = Student::new; //@TODO compilation issue
    }
}
