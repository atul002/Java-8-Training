package ParallelStream;

import data.Student;
import data.StudentDataBase;

import java.time.Duration;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelExample2 {

    public static List<String> sequentialPrintStudentActivities() {
        long startTime = System.currentTimeMillis();

                List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                //.peek(student -> System.out.println(student))
                .flatMap(List::stream)
                .collect(toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Duration for Sequential: "+(endTime-startTime));

        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities() {
        long startTime = System.currentTimeMillis();

        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .parallel()
                .map(Student::getActivities)
                //.peek(student -> System.out.println(student))
                .flatMap(List::stream)
                .collect(toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Duration for Parallel: "+(endTime-startTime));


        return studentActivities;
    }

    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
