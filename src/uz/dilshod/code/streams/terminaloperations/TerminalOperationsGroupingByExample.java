package uz.dilshod.code.streams.terminaloperations;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Terminal operations - groupingBy()
 *
 *  groupingBy() collector is equivalent to the groupBy() operation in SQL.
 *
 *  Used to group the elements based on a property.
 *
 *  The output of groupingBy() is going to be a Map<K<V>.
 *
 *  There are three different versions of groupingBy().
 *      groupingBy(classifier)
 *      groupingBy(classifier, downstream)
 *      groupingBy(classifier, supplier, downstream)
 */
public class TerminalOperationsGroupingByExample {

    public static void groupByExample1() {
        Map<String, List<Student>>  mapGrouping= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));

        System.out.println("Example 1 of grouping : " + mapGrouping);

    }

    public static void groupByExample2() {
        Map<String, List<Student>>  mapGrouping= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa()>=3.8? "OUTSTANDING":"AVERAGE"));

        System.out.println("Example 2 of grouping : " + mapGrouping);

    }

    public static void groupByExample3() {
        Map<Integer, Map<String,List<Student>>>  mapGrouping = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa()>=3.8? "OUTSTANDING":"AVERAGE")));

        System.out.println("Example 3 of grouping : " + mapGrouping);

    }

    public static void groupByExample4() {
        Map<Integer, Integer>  mapGrouping = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.summingInt(Student::getNoteBooks)));

        System.out.println("Example 4 of grouping : " + mapGrouping);

    }

    public static void groupByExample5() {
        LinkedHashMap<String, Set<Student>>  mapGrouping = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName,
                        LinkedHashMap::new,
                        Collectors.toSet()));

        System.out.println("Example 5 of grouping : " + mapGrouping);

    }

    public static void groupByExample6() {
        Map<Integer, Optional<Student>>  mapGrouping = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println("Example 6 of grouping : " + mapGrouping);

    }

    public static void groupByExample7() {
        Map<Integer, Student>  mapGrouping = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa))
                                ,Optional::get)));

        System.out.println("Example 7 of grouping : " + mapGrouping);

    }

    public static void main(String[] args) {
        groupByExample1();
        groupByExample2();
        groupByExample3();
        groupByExample4();
        groupByExample5();
        groupByExample6();
        groupByExample7();
    }
}
