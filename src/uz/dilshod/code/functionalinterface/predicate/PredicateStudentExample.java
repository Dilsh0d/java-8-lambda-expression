package uz.dilshod.code.functionalinterface.predicate;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) ->s.getGradeLevel()>=3;

    static Predicate<Student> p2 = (s) ->s.getGpa()>=3.9;

    public static void filterStudentByGradeLevel() {
        System.out.println("filterStudentByGradeLevel : ");
         List<Student> studentList = StudentDataBase.getAllStudents();

         studentList.forEach(student -> {
             if(p1.test(student)) {
                 System.out.println(student);
             }
         });
    }

    public static void filterStudentByGpa() {
        System.out.println("filterStudentByGpa : ");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(p2.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGradeLevelAndGpa() {
        System.out.println("filterStudentByGradeLevelAndGpa : ");

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(p1.and(p2).negate().test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();

        filterStudentByGradeLevelAndGpa();
    }
}
