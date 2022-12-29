package uz.dilshod.code.defaultstaticmethodinterface;

/**
 * @author Tadjiev Dilshod
 * @since 0.1.2
 */
public class MultipleInheritanceImpl12 implements MultipleInterface1, MultipleInterface4 {

    public static void main(String[] args) {
        MultipleInheritanceImpl12 multipleInheritanceImpl12 = new MultipleInheritanceImpl12();
        multipleInheritanceImpl12.methodA();
    }

    @Override
    public void methodA() {
        System.out.println("Inside Method A " + MultipleInheritanceImpl12.class);
    }
}
