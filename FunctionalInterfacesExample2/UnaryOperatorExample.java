package FunctionalInterfacesExample2;

import java.util.function.UnaryOperator;
//same input same output
public class UnaryOperatorExample {
    static UnaryOperator<String> unaryOperator = (s) -> s.concat(" hello");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Atul"));
    }
}
