package uz.dilshod.code.defaultstaticmethodinterface;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class SortUsingComparatorExample {

    static Consumer<Student>  studentConsumer = System.out::println;
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
    static Comparator<Student>gradeLevelComparator = Comparator.comparingInt(Student::getGradeLevel);

    public static void sortByName(List<Student> studentList) {
        studentList.sort(nameComparator);
    }

    public static void sortByGpa(List<Student> studentList) {
        studentList.sort(gpaComparator);
    }

    public static void comparatorChaining(List<Student> studentList) {
        studentList.sort(gradeLevelComparator.thenComparing(nameComparator));
    }

    public static void sortNulValues(List<Student> studentList) {
        Comparator<Student> studentComparator =Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Sort by Name!");
        System.out.println("Sort by Name!");
        sortByName(studentList);
        studentList.forEach(studentConsumer);

        System.out.println("Sort by Gpa!");
        System.out.println("Sort by Gpa!");
        sortByGpa(studentList);
        studentList.forEach(studentConsumer);

        System.out.println("Sort by GradeLevel and Name!");
        System.out.println("Sort by GradeLevel and Name!");
        comparatorChaining(studentList);
        studentList.forEach(studentConsumer);

        System.out.println("Sort Null values!");
        System.out.println("Sort Null values!");
        sortNulValues(studentList);
        studentList.forEach(studentConsumer);
    }
}
