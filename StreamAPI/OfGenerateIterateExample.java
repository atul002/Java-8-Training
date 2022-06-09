package StreamAPI;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class OfGenerateIterateExample {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Atul", "Aman", "Singh");
        stringStream.forEach(System.out::println);

        Stream.iterate(1, x->x*2)
                .limit(5)
                .forEach(System.out::println);

        Supplier<Integer> integerSupplier = new Random() :: nextInt;
        Stream.generate(integerSupplier)
        .limit(5)
                .forEach(System.out::println);
    }
}
