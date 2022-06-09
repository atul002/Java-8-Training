package ImperativeVsDeclarative;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,2,3,4,5,5,6,7,8,9,9,10);

        /* Imperative Style of Programming */

        List<Integer> uniquieList =  new ArrayList<>();
        for(Integer integer: integerList) {
            if(!uniquieList.contains(integer)) {
                uniquieList.add(integer);
            }
        }
        System.out.println("List: "+uniquieList);

        /*Declarative Style of Programming*/
        List<Integer> uniqueList =  integerList.stream().distinct().collect(Collectors.toList());
        System.out.println("List: "+uniqueList);
    }
}
