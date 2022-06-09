package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapAndPeekExample1 {
    public static void main(String[] args) {
        //Student Name and Activities in a Map

        Predicate<Student> studentPredicate = student -> student.getGradeLevel()>=3;
        Predicate<Student> studentGpaPredicate = student -> student.getGpa()>=3.9;


        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek(student -> System.out.println("Peek 1 - "+student))
                .filter(studentPredicate)
                //.peek(student -> System.out.println("Peek 2 - "+student))
                .filter(studentGpaPredicate)
                //.peek(student -> System.out.println("Peek 3 - "+student))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }
}
