package uz.dilshod.code.functionalinterface.consumer;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class BiConsumerExample {

    public static void studentNameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
        List<Student>  students = StudentDataBase.getAllStudents();

        students.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a,b) -> {
            System.out.println("a: " + a + " , b: " + b);
        };

        biConsumer.accept("java7", "java8");

        BiConsumer<Integer, Integer> multiply = (a, b) -> {
            System.out.println("Multiplication is : " + a + "*" + b + " = " + (a * b));
        };

        BiConsumer<Integer, Integer> division  = (a, b) -> {
            System.out.println("Division is : " + a + "/" + b + " = " + (a / b));
        };

        multiply.andThen(division).accept(30,6);

        studentNameAndActivities();
    }
}
