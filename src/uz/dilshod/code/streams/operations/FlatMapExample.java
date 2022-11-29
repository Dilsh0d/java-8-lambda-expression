package uz.dilshod.code.streams.operations;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Stream API: flatMap()
 *
 * flatMap : Converts(Transformers) one type to another as like map() method
 * Used in the context of Stream where each element in the stream represents multiple elements.
 *
 * Example:
 *      Each Stream element represents multiple elements.
 *          Stream<List>
 *          Stream<Arrays>
 */
public class FlatMapExample {

    public static List<String> getStudentActivities() {
        List<String> studentActivities  =StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static void main(String[] args) {
        System.out.println("Student activities : " + getStudentActivities());
    }
}
