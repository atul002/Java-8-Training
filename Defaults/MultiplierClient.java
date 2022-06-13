package Defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,3,5);

        System.out.println("Result using implmnt: "+multiplier.multiply(integerList));
        System.out.println("Result using default: "+multiplier.size(integerList));
        System.out.println("Result using static: "+Multiplier.isEmpty(integerList));
    }
}
