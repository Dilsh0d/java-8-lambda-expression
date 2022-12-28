package uz.dilshod.code.streams.parallelprocessing;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Parallel stream pipeline
 */
public class ParallelStreamPipelineExample {

    public static List<String> sequentialStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> studentActivities  = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential : " + (endTime-startTime));
        return studentActivities;
    }

    public static List<String> parallelStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> studentActivities  = StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel : " + (endTime-startTime));
        return studentActivities;
    }

    public static void main(String[] args) {
        sequentialStudentActivities();
        parallelStudentActivities();
    }
}
