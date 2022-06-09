package StreamTerminals;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingBy1 {

    public static void groupingByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));

        System.out.println("Student Grouping by Gender: "+studentMap);
    }

    public static void groupingByGpa() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getGpa()>=3 ? "Good" : "Average"));

        System.out.println("Student Grouping by Gap: "+studentMap);
    }

    public static void twoLevelGrouping1() {
        Map<Integer, Map<String,List<Student>>> studentMap = StudentDataBase.getAllStudents()
                        .stream()
                                .collect(Collectors.groupingBy(Student::getGradeLevel,
                                        Collectors.groupingBy(student->student.getGpa()>=3.6 ? "Good" : "Average")));

        System.out.println("Student Grouping by GradeLevel: "+studentMap);
    }

    public static void twoLevelGrouping2() {
        Map<String, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName,
                        Collectors.summingInt(Student::getNotebooks)));
        System.out.println("Student Grouping and Summing: "+studentMap);
    }

    public static void threeLevelGrouping() {
       LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
        System.out.println("Three Level Grouping:"+studentLinkedHashMap);
    }

    public static void topGpa() {
       Map<Integer, Optional<Student>> student =  StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(student);
    }
    public static void main(String[] args) {
            groupingByGender();
            groupingByGpa();
            twoLevelGrouping1();
            twoLevelGrouping2();
            threeLevelGrouping();
            topGpa();

    }
}
