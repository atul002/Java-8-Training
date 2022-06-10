package ParallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelExample1 {
    public static long performanceCheck(Supplier<Integer> supplier, int count) {
        long startTime = System.currentTimeMillis();
        for (int i=0; i<count; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public static int sequentialSum() {
        return IntStream.rangeClosed(1,10000)
                .sum();
    }

    public static int parallelSum() {
        return IntStream.rangeClosed(1,10000)
                .parallel()
                .sum();
    }
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential Stream: "+performanceCheck(ParallelExample1::sequentialSum, 10));
        System.out.println("Parallel Stream: "+performanceCheck(ParallelExample1::parallelSum, 10));


    }
}
