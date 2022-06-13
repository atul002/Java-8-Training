package Defaults;

import java.util.*;

public class DefaultMethod1 {
    public static void main(String[] args) {
        /*
        * Sorting String in Alphabetical Order
        * */

        List<String> stringList1 = Arrays.asList("Atul", "Raman", "Neha", "Laxman", "Anuj", "Charlie");
        List<String> stringList2 = Arrays.asList("Atul", "Raman", "Neha", "Laxman", "Anuj", "Charlie");

        /*
        Prior to Java 8
        * */

        Collections.sort(stringList1);
        System.out.println("Sorted by Collections.sort(): "+stringList1);

        /*
        * After advent of Java 8
        * */

        stringList2.sort(Comparator.naturalOrder());
        System.out.println("Sorted using the List.sort(): "+stringList2);

        stringList2.sort(Comparator.reverseOrder());
        System.out.println("Sorted using the List.sort() reverse: "+stringList2);


    }
}
