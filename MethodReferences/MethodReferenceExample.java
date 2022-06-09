package MethodReferences;

interface Sum {
    public abstract void sum(int a, int b);
}
public class MethodReferenceExample {
    public static void add(int x, int y) {
        System.out.println("Sum : " +(x+y));
    }

    public static void main(String[] args) {
        Sum s = (a, b) -> System.out.println("Sum : "+(a+b));
        s.sum(10,20);

        Sum s1 = MethodReferenceExample::add;
        s1.sum(100,200);
    }

}
