package uz.dilshod.code.methodreference;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.function.Consumer;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class ConsumerMethodReferenceExample {

    /**
     * Classname::method_name
     */
    static Consumer<Student> c1 = System.out::println;

    /**
     * Classname::instance_Method_name
     */
    static Consumer<Student> c2 = Student::printListActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);

        StudentDataBase.getAllStudents().forEach(c2);
    }
}
