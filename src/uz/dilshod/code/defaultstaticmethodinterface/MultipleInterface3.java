package uz.dilshod.code.defaultstaticmethodinterface;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public interface MultipleInterface3 extends MultipleInterface2{

    default void methodC() {
        System.out.println("Inside Method C");
    }
}
