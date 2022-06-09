package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitAndSkipExample {

    public static Optional<Integer> limitElements(List<Integer> integerList) {
        return integerList.stream().limit(2).reduce((a,b)->a+b);
    }

    public static Optional<Integer> skipElements(List<Integer> integerList) {
        return integerList.stream().skip(2).reduce((a,b)->a+b);
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Optional<Integer> limitResult = limitElements(list);
        if(limitResult.isPresent()) {
            System.out.println("Limited Sum: "+limitResult.get());
        }

        Optional<Integer> skipResult = skipElements(list);
        if(skipResult.isPresent()) {
            System.out.println("Skipped Sum: "+skipResult.get());
        }
    }
}
