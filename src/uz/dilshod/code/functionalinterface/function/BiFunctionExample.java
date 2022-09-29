package uz.dilshod.code.functionalinterface.function;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;
import uz.dilshod.code.functionalinterface.predicate.PredicateStudentExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction = (students, studentPredicate) -> {
        Map<String,Double> studentGradeMap = new HashMap<>();

        students.forEach(student -> {
            if(studentPredicate.test(student)) {
                studentGradeMap.put(student.getName(),student.getGpa());
            }
        });
        return studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p1));
    }
}
