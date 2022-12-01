package uz.dilshod.code.streams.operations;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.Optional;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Stream API : findFirst() and findAny()
 *
 * Used to find an element in the stream.
 *
 * Both the functions returns the result of type Optional.
 *
 *      findFirst() - Returns first element in the stream.
 *      findAny() - Returns the first encountered element in the stream.
 */
public class FindFirstAndFindAnyExample {

    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=4.1)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> studentOptionalFindAny = findAnyStudent();
        if (studentOptionalFindAny.isPresent()) {
            System.out.println("Find any student is result : " + studentOptionalFindAny.get());
        } else {
            System.out.println("Not found any student!");
        }

        Optional<Student> studentOptionalFindFirst = findFirstStudent();
        if (studentOptionalFindFirst.isPresent()) {
            System.out.println("Find first student is result : " + studentOptionalFindFirst.get());
        } else {
            System.out.println("Not found first student!");
        }
    }
}
