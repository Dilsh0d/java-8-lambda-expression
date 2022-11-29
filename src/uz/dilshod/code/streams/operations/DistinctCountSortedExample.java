package uz.dilshod.code.streams.operations;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Stream API - distinct(), count() and sorted()
 *
 * distinct - Returns a stream with unique elements.
 *
 * count - Returns a long with the total no of elements in the stream.
 *
 * sorted - Sort the elements in the stream
 *
 */
public class DistinctCountSortedExample {

    public static List<String> getStudentActivities() {
        List<String> studentActivities  = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static long getStudentTotalOfActivitiesCount() {
        long noOfStudentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .count();
        return noOfStudentActivities;
    }

    public static void main(String[] args) {
        System.out.println("Student activities : " + getStudentActivities());
        System.out.println("Number of student activities count: " + getStudentTotalOfActivitiesCount());
    }
}
