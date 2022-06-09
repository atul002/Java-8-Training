package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {
    public static int findMax(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (x,y)->x>y?x:y);
    }

    public static Optional<Integer> findMaxOptional(List<Integer> integerList) {
        return Optional.of(integerList.stream()
                .reduce(0, (x, y) -> x > y ? x : y));
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,22,3,4,5,6,7,9);
        List<Integer> list1 = Arrays.asList();
        System.out.println("Max Value: "+findMax(list));

        Optional<Integer> maxValue = findMaxOptional(list);
        if(maxValue.isPresent()) {
            System.out.println("Max Value using Optional: "+maxValue.get());
        }
        else {
            System.out.println("No Max Value found!");
        }
    }
}
