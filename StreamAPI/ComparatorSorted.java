package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorSorted {

    public static List<Student> sortStudentByName () {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpa () {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Students Sorted by Name:");
        sortStudentByName().forEach(System.out::println);

        System.out.println("Students Sorted by GPA:");
        sortStudentsByGpa().forEach(System.out::println);
    }
}
