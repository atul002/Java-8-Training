package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample1 {
    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGender().equals("female")))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
//        System.out.println("Female Students: "+filterStudents());
        filterStudents().forEach(System.out::println);
    }
}
