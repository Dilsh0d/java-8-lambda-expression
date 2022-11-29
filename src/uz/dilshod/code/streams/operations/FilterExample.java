package uz.dilshod.code.streams.operations;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Stream API : filter()
 *
 * filter - filters the elements in the stream.
 *
 */
public class FilterExample {


    public static List<Student> filterStudents () {
        List<Student> students = StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGender().equals("female")))
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.toList());
        return students;
    }

    public static void main(String[] args) {
//        System.out.println("Female students list : "+filterStudents());

        filterStudents().forEach(System.out::println);
    }
}
