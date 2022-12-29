package uz.dilshod.code.defaultstaticmethodinterface;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public interface MultipleInterface4 {

    default void methodA() {
        System.out.println("Inside Method A "+MultipleInterface4.class);
    }
}
