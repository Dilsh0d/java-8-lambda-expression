package uz.dilshod.code.streams.terminaloperations;

import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.stream.Collectors;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 *  Terminal operations - counting
 *
 *      counting() Collector returns the total numbers of elements as a result.
 */
public class TerminalOperationsCountingExample {

    public static long counting() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println("Counting list: "+ counting());
    }
}
