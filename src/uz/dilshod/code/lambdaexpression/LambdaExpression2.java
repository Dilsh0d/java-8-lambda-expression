package uz.dilshod.code.lambdaexpression;

/**
 * Lambda expression example with Runnable Interface
 */
public class LambdaExpression2 {

    /**
     * We are showing Legacy and Functional Interface difference this example
     * with Runnable interface
     */
    public static void main(String[] args) {
        /**
         * Legacy Java 8 code style
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable run method example 1");
            }
        };

        new Thread(runnable).start();

        /**
         * Lambda syntax code style
         * ()->{}
         */
        Runnable runnableLambda = ()->{System.out.println("Runnable run method example 2");};

        Runnable runnableLambdaMultiplyBody = ()->{
            System.out.println("Runnable run method example 3");
            System.out.println("Runnable run method example 3");
        };

        Runnable runnableLambdaSimple = ()->System.out.println("Runnable run method example 4");

        new Thread(runnableLambda).start();
        new Thread(runnableLambdaMultiplyBody).start();
        new Thread(runnableLambdaSimple).start();

        new Thread(()->System.out.println("Runnable run method example 5"));
    }
}
