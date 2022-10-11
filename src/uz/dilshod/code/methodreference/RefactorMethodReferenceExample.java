package uz.dilshod.code.methodreference;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.function.Predicate;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class RefactorMethodReferenceExample {

    public static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThan;


    public static boolean greaterThan(Student s) {
        return s.getGradeLevel()>=3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
