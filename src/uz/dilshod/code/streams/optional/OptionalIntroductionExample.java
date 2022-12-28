package uz.dilshod.code.streams.optional;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.Optional;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Introduction to Optional
 *
 *      Introduction as part of java 8 to represent a Non-Null value
 *
 *      Avoid Null Pointer Exception and Unnecessary Null Check.
 *
 *      Inspired from the new languages such as scala, groovy etc.
 */
public class OptionalIntroductionExample {

    public static String getStudentName() {
//        Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if (student != null) {
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()) {
            return studentOptional.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        String name = getStudentName();
        if(name!=null) {
            System.out.println("Student name : " + name);
        }else{
            System.out.println("Student name not found!");
        }

        Optional<String> studentOptional = getStudentNameOptional();
        if(studentOptional.isPresent()) {
            System.out.println("Optional Student name : " + studentOptional.get());
        } else {
            System.out.println("Optional Student name not found!");
        }

    }
}
