package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(10);
        l.add(20);
        l.add(15);
        l.add(31);
        l.add(34);
        System.out.println("Before Filtering: " +l);

        List<Integer> l1 = new ArrayList<Integer>();
        for(Integer I : l) {
            if (I%2==0) {
                l1.add(I);
            }
        }
        System.out.println("After Filtering: " +l1);


        /*By using Stream API*/
        List<Integer> l2 = l.stream().filter(I->I%2==0).collect(Collectors.toList());
        System.out.println("Filtering using Stream: " +l2);

    }
}
