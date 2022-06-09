package NumericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericExample1 {

    public static int sumOfN(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (x,y)->x+y);
    }

    public static int sumInt() {
        return IntStream.rangeClosed(1,6).sum();
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Sum of Numbers: "+sumOfN(integerList));
        System.out.println("Sum of Stream Numbers: "+sumInt());
    }
}
