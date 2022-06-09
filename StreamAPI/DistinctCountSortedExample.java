package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class DistinctCountSortedExample {
    public static List<String> printStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                //.peek(student -> System.out.println(student))
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        return studentActivities;
    }

    public static long getStudentActivitiesCount() {
        long studentActivityCount = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        return studentActivityCount;
    }

    public static List<Integer> integerList() {
        List<Integer> l1 = Arrays.asList(2,9,1,3,2,4);
        List<Integer> l2 = Arrays.asList(4,5,6,1,2,4);
        List<Integer> l3 = Arrays.asList(7,8,9,6,7,3);

        List<List<Integer>> listOfLists = Arrays.asList(l1,l2,l3);

        List<Integer> listOfAllIntegers = listOfLists.stream()
                //.peek(x-> System.out.println(x))
                .flatMap(x->x.stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        return listOfAllIntegers;
    }
    public static void main(String[] args) {
        System.out.println("Distinct Activities: "+printStudentActivities());
        System.out.println("Distinct Activities Count: "+getStudentActivitiesCount());
        System.out.println("Distinct List: "+integerList());
    }
}
