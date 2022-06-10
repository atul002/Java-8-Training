package ParallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelBoxed {

    public static int sequentialSum(List<Integer> integerList) {
        long startTime = System.currentTimeMillis();
        int sum = integerList.stream().reduce(0, (a,b)-> a+b);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Duration in Sequential: "+duration);
        return sum;
    }

    public static int parallelSum(List<Integer> integerList) {
        long startTime = System.currentTimeMillis();
        int sum = integerList.parallelStream().reduce(0, (a,b)-> a+b);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Duration in Parallel: "+duration);
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1,10000)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(sequentialSum(integerList));
        System.out.println(parallelSum(integerList));
    }
}
