package Lambda;

import java.util.function.Consumer;

public class LambdaVariables {
    public static void main(String[] args) {
        int i = 0;
        Consumer<Integer> consumer = (i1) -> {
            int i2;
            //i=1;
            System.out.println(i);
        };
    }
}
