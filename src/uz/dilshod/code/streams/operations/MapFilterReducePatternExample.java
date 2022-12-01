package uz.dilshod.code.streams.operations;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class MapFilterReducePatternExample {

    private static int noOfNoteBooks() {
       return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getNoteBooks)
                .reduce(0,(s1,s2) -> s1+s2);
    }

    private static int noOfNoteBooks1() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                .reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("Number of note books: " + noOfNoteBooks());
        System.out.println("Number of note books1: " + noOfNoteBooks1());
    }
}
