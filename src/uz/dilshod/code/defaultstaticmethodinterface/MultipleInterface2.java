package uz.dilshod.code.defaultstaticmethodinterface;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public interface MultipleInterface2 extends MultipleInterface1 {

    default void methodB() {
        System.out.println("Inside Method B");
    }

    @Override
    default void methodA() {
        System.out.println("Inside Method B" + MultipleInterface2.class);
    }
}
