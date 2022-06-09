package MethodReferences;

public class RunnableExample {
    public static void child() {
        for(int i=0; i<10; i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        Runnable r = RunnableExample::child;
        Thread t = new Thread(r);
        t.start();

        for(int i=0; i<10; i++) {
            System.out.println("Main Thread");
        }
    }


}
