package StreamTerminals;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class SumAvgIntExample {
    public static int sum() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNotebooks));
    }

    public static double avg() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getNotebooks));
    }
    public static void main(String[] args) {
        System.out.println("Total Notebooks: "+sum());
        System.out.println("Average Notebooks: "+avg());
    }
}
