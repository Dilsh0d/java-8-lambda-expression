package uz.dilshod.code.functionalinterface.supplier;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Adam",2,3.6, "male",10, Arrays.asList("swimming", "basketball","volleyball"));
        };

        Supplier<List<Student>> listStudents = () -> StudentDataBase.getAllStudents();

        System.out.println("Student is : " + studentSupplier.get());

        System.out.println("Students are : "+ listStudents.get());
    }
}
