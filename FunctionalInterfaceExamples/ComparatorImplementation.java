package FunctionalInterfaceExamples;

import java.util.Comparator;

public class ComparatorImplementation {
    public static void main(String[] args) {
        /*
        Declarative approach
        */
        Comparator<Integer> comparatorInteger = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                /*
                * 0 -> o1 == o2
                * 1 -> o1>o2
                * -1 -> o2 > o1
                * */
            }
        };
        System.out.println("Comparator Legacy: " +comparatorInteger.compare(3,2));

        /*Declarative Way using Lambda expressions*/
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> {
            return a.compareTo(b);
        };
        System.out.println("Comparator Lambda: " +comparatorLambda.compare(4,5));


        Comparator<Integer> comparatorLambda1 = (a, b) -> {
            return a.compareTo(b);
        };
        System.out.println("Comparator Lambda: " +comparatorLambda1.compare(5,5));
    }
}
