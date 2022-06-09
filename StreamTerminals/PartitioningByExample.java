package StreamTerminals;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningByExample {

    public static void partitioningBy1() {

        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;

        Map<Boolean, List<Student>> patitioningMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate));
        System.out.println(patitioningMap);
    }

    public static void partitioningBy2() {

        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;

        Map<Boolean, Set<Student>> patitioningMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate,
                        Collectors.toSet()));
        System.out.println(patitioningMap);
    }

    public static void main(String[] args) {
//        partitioningBy1();
        partitioningBy2();
    }
}
