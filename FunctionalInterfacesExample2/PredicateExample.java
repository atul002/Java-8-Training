package FunctionalInterfacesExample2;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p1 = (i) -> {return i%2==0;}; //only for syntactical means
    static Predicate<Integer> p2 = (i) -> i%2==0;

    static Predicate<Integer> p3 = (i) -> i%5==0;

    public static void predicateAnd() {
        System.out.println("Predicate and Result is: "+p1.and(p2).test(10));
        System.out.println("Predicate and Result is: "+p1.and(p2).test(9));
    }

    public static void predicateOr() {
        System.out.println("Predicate or Result is: "+p1.or(p2).test(10));
        System.out.println("Predicate or Result is: "+p1.or(p2).test(8));
    }

    public static void predicateNegate() {
        System.out.println("Predicate or Result is: "+p1.or(p2).negate().test(10));
        System.out.println("Predicate or Result is: "+p1.or(p2).negate().test(8));
    }

    public static void main(String[] args) {
        System.out.println(p1.test(2));
        System.out.println(p2.test(2));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
