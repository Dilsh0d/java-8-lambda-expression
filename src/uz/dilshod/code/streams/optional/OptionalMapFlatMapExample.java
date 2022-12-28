package uz.dilshod.code.streams.optional;

import uz.dilshod.code.functionalinterface.data.Bike;
import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.Optional;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class OptionalMapFlatMapExample {

    public static void optionalFilter() {
        Optional<Student> optionalStudent =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        optionalStudent
                .filter(student -> student.getGpa()>=3.8)
                .ifPresent(student -> System.out.println("Optional Filter GPA great than 3.8 student: "+ student));
    }

    public static void optionalMap() {
        Optional<Student> optionalStudent =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        optionalStudent
                .filter(student -> student.getGpa()>=3.6)
                .map(Student::getName)
                .ifPresent(studentName -> System.out.println("Optional Map GPA great than 3.6 student name : "+ studentName));
    }

    public static void optionalFlatMap() {
        Optional<Student> optionalStudent =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        optionalStudent
                .filter(student -> student.getGpa()>=3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName)
                .ifPresent(bike -> System.out.println("Optional Flat Map GPA great than 3.5 bike name: "+ bike));
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }

}
