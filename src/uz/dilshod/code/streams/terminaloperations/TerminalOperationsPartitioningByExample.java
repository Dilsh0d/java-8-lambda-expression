package uz.dilshod.code.streams.terminaloperations;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Terminal operations - partitioningBy()
 *
 *  partitioningBy() collector is also a kind of groupingBy().
 *  partitioningBy() accepts a predicate as an input.
 *
 *  Return type of the collector is going to be Map<K,V>
 *      The key of the return type is going to be a Boolean.
 *  There are two different versions of partitioningBy()
 *      partitioningBy(predicate)
 *      partitioningBy(predicate, downstream) // downstream  -> could be of any collector
 *
 */
public class TerminalOperationsPartitioningByExample {

    public static void partitioningBy_1() {

        Predicate<Student> gpaStudent = student -> student.getGpa()>=3.8;

        Map<Boolean, List<Student>> studentPartition= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaStudent));

        System.out.println("PartitioningBy example 1: "+ studentPartition);
    }

    public static void partitioningBy_2() {

        Predicate<Student> gpaStudent = student -> student.getGpa()>=3.8;

        Map<Boolean, Set<Student>> studentPartition= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaStudent,Collectors.toSet()));

        System.out.println("PartitioningBy example 2: "+ studentPartition);
    }

    public static void main(String[] args) {
        partitioningBy_1();
        partitioningBy_2();
    }
}
