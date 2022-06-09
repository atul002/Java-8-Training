package ImperativeVsDeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        /*
        Imperative Style
        Sum of 100 numbers
        */
        int sum=0;
        for(int i=0; i<=100; i++) {
            sum+=i;
        }
        System.out.println("Sum using Imperative approach: "+sum);

        /*
        Declarative Style
        Sum of 100 numbers
        */
        int sum1= IntStream.rangeClosed(0,100).sum();
        System.out.println("Sum using Declarartive approach: "+sum1);
    }
}
