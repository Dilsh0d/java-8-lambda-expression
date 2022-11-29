package uz.dilshod.code.streams.api;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class StreamsExample {
    public static void main(String[] args) {

        // students name and there activities in a map
        Predicate<Student> studentPredicate = student -> student.getGradeLevel()>=3;
        Predicate<Student> studentGpaPredicate = student -> student.getGpa()>=3.9;

       Map<String, List<String>> studentActivities = StudentDataBase.getAllStudents().stream()
               .peek(studen -> {
                   System.out.println(studen); // for debug
               })
               .filter(studentPredicate)
               .peek(student -> {
                   System.out.println("after 1 st filter : " + student);
               })
               .filter(studentGpaPredicate)
               .peek(student -> {
                   System.out.println("after 2 nd filter : " + student);
               })
               .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentActivities);
    }
}
