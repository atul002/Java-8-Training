package StreamTerminals;

import data.StudentDataBase;

import java.util.stream.Collectors;

public class CountingExamples {

    public static long count() {
       return StudentDataBase.getAllStudents().stream()
               .filter(student -> student.getGpa()>=3.6)
                .collect(Collectors.counting());
    }
    public static void main(String[] args) {
        System.out.println("Counting: "+count());
    }
}
