package NumericStream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NumericExample2 {
    public static void main(String[] args) {

        System.out.println(IntStream.rangeClosed(1,20).count());
        IntStream.range(1,20).forEach(value -> System.out.print(value+" "));

        System.out.println("\n"+IntStream.rangeClosed(1,20).count());
        IntStream.rangeClosed(1,20).forEach(value -> System.out.print(value+" "));
        System.out.println();


        IntStream.rangeClosed(1,20).asDoubleStream().forEach(System.out::println);
    }
}
