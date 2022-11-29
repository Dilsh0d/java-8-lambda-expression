package uz.dilshod.code.streams.operations;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Stream api map()
 * map: Convert(transform) one type to another.
 * Don't get confused this with Map Collection.
 *
 */
public class MapExample {

    public static List<String> namesList() {
        List<String> studentList = StudentDataBase.getAllStudents().stream()
                // Student as an input -> Student name
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        return studentList;
    }

    public static Set<String> namesSet() {
        Set<String> studentList = StudentDataBase.getAllStudents().stream()
                // Student as an input -> Student name
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        return studentList;
    }
    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
