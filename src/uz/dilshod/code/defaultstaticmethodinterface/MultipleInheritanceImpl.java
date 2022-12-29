package uz.dilshod.code.defaultstaticmethodinterface;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class MultipleInheritanceImpl implements MultipleInterface1, MultipleInterface2, MultipleInterface3 {

    public static void main(String[] args) {
        MultipleInheritanceImpl multipleInheritance = new MultipleInheritanceImpl();
        multipleInheritance.methodA();
        multipleInheritance.methodB();
        multipleInheritance.methodC();
    }
}
