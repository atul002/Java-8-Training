package FunctionalInterfacesExample2;

public class FunctionExample1 {
    public static String performConcat(String str) {
        return FunctionExample.addSomeStirng.apply(str);

    }
    public static void main(String[] args) {
        String result = performConcat("Hello");
        System.out.println("Result is: "+result);
    }
}
