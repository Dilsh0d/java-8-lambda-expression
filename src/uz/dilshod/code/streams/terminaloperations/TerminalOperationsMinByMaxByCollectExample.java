package uz.dilshod.code.streams.terminaloperations;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Terminal operations - maxBy(), minBy(),
 *  Comparator as an input parameter and Optional as an output.
 *  maxBy()
 *      This collector is used in conjunction with comparator. Returns the max element
 *      based on the property passed to the comparator.
 *
 *  minBy()
 *      This collector is used in conjunction with comparator. Return the smallest element
 *      based on the property passed to the comparator.
 */
public class TerminalOperationsMinByMaxByCollectExample {

    public static Optional<Student> minBy() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println("Min by GPA :"+ minBy().get());
        System.out.println("Max by GPA :"+ maxBy().get());
    }
}
