package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxExample2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,1,9,3,6,3,8,9,9);

        Optional<Integer> minValue = list.stream().min((a,b) -> a.compareTo(b));
        Optional<Integer> maxValue = list.stream().max((a,b) -> a.compareTo(b));

        if(minValue.isPresent()) {
            System.out.println("Max Value: "+minValue.get());
        }
        else {
            System.out.println("No Max Value");
        }

        if(maxValue.isPresent()) {
            System.out.println("Max Value: "+maxValue.get());
        }
        else {
            System.out.println("No Max Value");
        }
    }
}
