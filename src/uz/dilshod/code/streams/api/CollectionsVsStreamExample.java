package uz.dilshod.code.streams.api;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class CollectionsVsStreamExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Dilsh0d");
        names.add("Bekzod");
        names.add("Jahongir");
        names.add("Ra'no");

        for(String name:names) {
            System.out.println(name);
        }

        names.remove(0);

        System.out.println(names);

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
//        nameStream.forEach(System.out::println);
    }
}
