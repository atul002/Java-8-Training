package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndSortedExample {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(40);
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(45);
        l.add(48);
        System.out.println("Original ArrayList: "+l);

        List<Integer> l1 = new ArrayList<Integer>();
        for (Integer i: l) {
            l1.add(i*2);
        }
        System.out.println("Manually Mapped ArrayList: "+l1);

        /*Using Streams to Map ArrayList*/
        List<Integer> l2 = l.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println("Stream Mapped ArrayList: "+l2);

        /*Using Streams to sort the ArrayList*/
        List<Integer> l3 = l.stream().sorted().collect(Collectors.toList());
        System.out.println("Stream Sorted ArrayList: "+l3);

        /*Using Stream to sort ArrayList in Descending Order*/
        List<Integer> l4 = l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Desceding Arraylist: "+l4);
    }
}
