package Defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier {
    public static void main(String[] args) {

    }

    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a,b) -> a*b);
    }
}
