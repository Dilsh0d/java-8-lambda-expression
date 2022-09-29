package uz.dilshod.code.functionalinterface.function;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;
import uz.dilshod.code.functionalinterface.predicate.PredicateStudentExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class FunctionStudentExample {

    static Function<List<Student>, Map<String,Double>> studentFunction = (students -> {
       Map<String,Double> studentGradeMap = new HashMap<>();

       students.forEach(student -> {
           if(PredicateStudentExample.p1.test(student)) {
               studentGradeMap.put(student.getName(), student.getGpa());
           }
       });
       return studentGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
