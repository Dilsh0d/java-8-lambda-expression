package uz.dilshod.code.streams.optional;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.Optional;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class OptionalOrElseGetThrowExample {

    public static String  orElse() {
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        String name = studentOptional
                .map(Student::getName)
                .orElse("Student does not find!");

        return name;
    }

    public static String  orElseGet() {
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional
                .map(Student::getName)
                .orElseGet(() -> "Student does not find!");

        return name;
    }

    public static String orElseThrow() {
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional
                .map(Student::getName)
                .orElseThrow(() -> new RuntimeException("Student does not find!"));

        return name;
    }

    public static void main(String[] args) {
        System.out.println("Optional orElse Student name : " + orElse());
        System.out.println("Optional orElseGet Student name : " + orElseGet());
        System.out.println("Optional orElseThrow Student name : " + orElseThrow());
    }
}
