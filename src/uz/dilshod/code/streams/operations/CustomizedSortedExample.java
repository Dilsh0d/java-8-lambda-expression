package uz.dilshod.code.streams.operations;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Stream API:
 *
 * Customize sorted example
 */
public class CustomizedSortedExample {

    public static List<Student> sortStudentsByName() {
        List<Student> studentSortByName  = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
        return studentSortByName;
    }

    public static List<Student> sortStudentsByGpa() {
        List<Student> studentSortByName  = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
        return studentSortByName;
    }

    public static List<Student> sortStudentsByGpaDesc() {
        List<Student> studentSortByName  = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
        return studentSortByName;
    }

    public static void main(String[] args) {
        System.out.println("Student sort by NAME :");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Student sort by GPA :");
        sortStudentsByGpa().forEach(System.out::println);
        System.out.println("Student sort by GPA DESC:");
        sortStudentsByGpaDesc().forEach(System.out::println);
    }
}
