package StreamTerminals;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy1 {

    public static void groupingByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));

        System.out.println("Student Gender Grouping: "+studentMap);
    }

    public static void groupingByGpa() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getGpa()>=3 ? "Good" : "Average"));

        System.out.println("Student Gender Grouping: "+studentMap);
    }
    public static void main(String[] args) {
            groupingByGender();
            groupingByGpa();

    }
}
