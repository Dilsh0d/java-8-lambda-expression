package uz.dilshod.code.streams.terminaloperations;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Terminal operations - avg(), sum()
 *
 *  summingInt() - this collector returns the sum as a result.
 *  averagingInt() - this collector returns the average as a result.
 *
 */
public class TerminalOperationsSumAvgUsingCollectExample {

    public static IntSummaryStatistics intSummaryStatistics() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summarizingInt(Student::getNoteBooks));
    }

    public static int summingInt() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double averagingInt() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        IntSummaryStatistics statistics = intSummaryStatistics();
        System.out.println("Max note books: " + statistics.getMax());
        System.out.println("Min note books: " + statistics.getMin());
        System.out.println("Avg note books: " + statistics.getAverage());
        System.out.println("Sum note books: " + statistics.getSum());

        System.out.println("Sum2 note books: " + summingInt());
        System.out.println("Avg2 note books: " + averagingInt());
    }
}
