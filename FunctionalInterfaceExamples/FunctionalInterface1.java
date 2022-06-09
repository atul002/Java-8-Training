package FunctionalInterfaceExamples;

@FunctionalInterface
public interface FunctionalInterface1 {
    public abstract void add(int a, int b);

    default void m1() {
        System.out.println("Default Method");
    }

    static void m2() {
        System.out.println("Static Method");
    }
}

class Test {
    public static void main(String[] args) {
        FunctionalInterface1 f1 = (a, b) -> System.out.println("Sum is: "+(a+b));
        f1.add(10,20);
        f1.m1();
        FunctionalInterface1.m2();
    }

}