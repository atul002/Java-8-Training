package FunctionalInterfacesExample2;

import java.util.function.Function;

public class FunctionExample {
    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSomeStirng = (name) -> name.toUpperCase().concat(" Singh");

    public static void main(String[] args) {
        System.out.println("Result is: "+function.apply("atul"));
        System.out.println("Result of andThen is: "+function.andThen(addSomeStirng).apply("atul"));
        System.out.println("Result of compose is: "+function.compose(addSomeStirng).apply("atul"));
    }
}
