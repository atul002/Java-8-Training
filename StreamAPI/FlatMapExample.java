package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FlatMapExample {
    public static List<String> printStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .peek(student -> System.out.println(student))
                .flatMap(List::stream)
                .collect(toList());

        return studentActivities;
    }

    public static List<Integer> integerList() {
        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(4,5,6);
        List<Integer> l3 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfLists = Arrays.asList(l1,l2,l3);

        List<Integer> listOfAllIntegers = listOfLists.stream()
                .peek(x-> System.out.println(x))
                .flatMap(x->x.stream())
                .collect(Collectors.toList());

        return listOfAllIntegers;
    }
    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(integerList());
    }
}
