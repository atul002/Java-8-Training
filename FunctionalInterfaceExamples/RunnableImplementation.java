package FunctionalInterfaceExamples;

public class RunnableImplementation {

    public static void main(String[] args) {
        /*Imperative Approach*/

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Declarative Thread");
            }
        };
        new Thread(r).start();



        /*Declarative Approach using Lambda Expressions*/

        Runnable r1 = () -> {
            System.out.println("Lambda Thread 1");
        };
        new Thread(r1).start();

        new Thread(
                ()->System.out.println("Lambda Thread 2")
        ).start();

    }
}
