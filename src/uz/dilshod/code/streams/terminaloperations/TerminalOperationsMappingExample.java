package uz.dilshod.code.streams.terminaloperations;

import uz.dilshod.code.functionalinterface.data.Student;
import uz.dilshod.code.functionalinterface.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 *
 * Terminal operations - mapping
 *
 *      mapping() collector applies a transformation function first and then collect the data in a collection
 *      (could be any type of collection)
 */
public class TerminalOperationsMappingExample {

    public static List<String> mappingName() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
    }

    public static Set<String> mappingNameSet() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));
    }

    public static List<String> mappingNameMap() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Stream Mapping list : " + mappingName());
        System.out.println("Stream Mapping set : " + mappingNameSet());
        System.out.println("Stream Mapping map : " + mappingNameMap());
    }
}
