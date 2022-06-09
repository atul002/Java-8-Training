package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static int multiply (List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a,b) -> a*b);
    }

    public static Optional<Integer> multiplyWithoutIdentity (List<Integer> integerList) {
        return integerList.stream()
                .reduce((a,b) -> a*b);
    }

    public static Optional<Student> highestGpa() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> (s1.getGpa()>s2.getGpa())?s1:s2);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> list1 = Arrays.asList();
        System.out.println("Product of Array elements is: "+multiply(list));

        Optional<Integer> result = multiplyWithoutIdentity(list);
        Optional<Integer> result1 = multiplyWithoutIdentity(list1);

        System.out.println("Array elements? : "+result.isPresent());
        System.out.println("Product: "+result.get());

        System.out.println("Array elements? : "+result1.isPresent());
        if(result1.isPresent()) {
            System.out.println("Product: " + result1.get());
        }

        Optional<Student> student = highestGpa();
        if(student.isPresent()) {
            System.out.println(student.get());

        }
    }
}
