package NumericStream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class AggregateMethods {
    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,20).sum();
        System.out.println("Sum is: "+sum);

        OptionalInt max = IntStream.rangeClosed(1,20).max();
        System.out.println("Max Value is: "+(max.isPresent()?max.getAsInt():-1));


        OptionalDouble avg = IntStream.rangeClosed(1,20).average();
        System.out.println("Max Value is: "+(avg.isPresent()?avg.getAsDouble():-1));
    }
}
