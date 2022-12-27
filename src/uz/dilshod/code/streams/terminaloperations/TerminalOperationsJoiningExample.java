package uz.dilshod.code.streams.terminaloperations;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.stream.Collectors;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Terminal operations - joining()
 *      joining() Collector performs the String concatenation on the elements in the stream
 *      joining() has the different overloaded versions.
 */
public class TerminalOperationsJoiningExample {

    public static String joining_1() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining_2() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }

    public static String joining_3() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(", ","(",")"));
    }

    public static void main(String[] args) {
        System.out.println("Example 1: "+ joining_1());
        System.out.println("Example 2: "+ joining_2());
        System.out.println("Example 3: "+ joining_3());
    }
}
