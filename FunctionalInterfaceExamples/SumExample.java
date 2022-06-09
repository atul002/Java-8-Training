package FunctionalInterfaceExamples;

@FunctionalInterface
interface Sum {
    public abstract int sum(int a, int b);
}

class child implements Sum {
    public int sum(int a, int b) {
        return (a+b);
    }
}
class SumExampleLegacy {
    public static void main(String[] args) {
        Sum s = new child();
        System.out.println("Legacy sum: " +s.sum(10,20));
    }
}

class SumExampleLambda {
    public static void main(String[] args) {
        Sum s1 = (a, b) -> a+b;
        System.out.println("Lambda Sum: " +s1.sum(10,30));
    }
}