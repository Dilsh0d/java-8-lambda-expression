package uz.dilshod.code.streams.operations;

import uz.dilshod.code.functionalinterface.data.StudentDataBase;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Stream API : anyMatch(), allMatch(), noneMatch()
 *
 *      All these functions takes in a predicate as an input and returns a Boolean as an output
 *          anyMatch() - Returns true if any one of the element matches the predicate, otherwise false.
 *          allMatch() - Returns true if all the element in the stream matches the predicate, otherwise false.
 *          noneMatch() - Just opposite to allMatch(). Returns true if none of the element in the stream matches the predicate, otherwise false.
 *
 */
public class AllAnyNoneMatchesExample {

    public static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3.5);
    }

    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=4.0);
    }

    public static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=4.1);
    }

    public static void main(String[] args) {
        System.out.println("Result of All Match: " + allMatch());

        System.out.println("Result of Any Match: " + anyMatch());

        System.out.println("Result of None Match: " + noneMatch());
    }
}
