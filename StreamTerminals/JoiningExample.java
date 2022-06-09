package StreamTerminals;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class JoiningExample {

    public static String joining_1() {
      return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining_2() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joining_3() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println("Joining Names: "+joining_1());
        System.out.println("Joining Names: "+joining_2());
        System.out.println("Joining Names: "+joining_3());

    }
}
