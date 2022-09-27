package uz.dilshod.code.functionalinterface.consumer;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class ConsumerExample {

    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static void printStudents() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c2);

    }

    public static void printStudentsWithActivities() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c3.andThen(c4)); // consumer chaining
    }

    public static void printStudentsWithActivitiesUsingCondition() {
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
                c3.andThen(c4).andThen(c2).accept(student);
            }
        });
    }

    public static void main(String[] args) {
//        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
//        c1.accept("java8");
//
//        printStudents();
//
//        printStudentsWithActivities();

        printStudentsWithActivitiesUsingCondition();
    }
}
