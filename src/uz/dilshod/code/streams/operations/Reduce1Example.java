package uz.dilshod.code.streams.operations;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.Optional;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class Reduce1Example {

    public static Optional<Student> getHighestGPAStudent() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa() ? s1 : s2));
    }

    public static void main(String[] args) {
        Optional<Student> studentOptional = getHighestGPAStudent();
        if (studentOptional.isPresent()) {
            System.out.println(studentOptional.get());
        }
    }
}
