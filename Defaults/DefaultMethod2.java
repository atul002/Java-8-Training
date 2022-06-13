package Defaults;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethod2 {
    static Consumer<Student> studentConsumer = (student -> System.out.println(student));

    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);


    public static void sortByName(List<Student> studentList) {
        System.out.println("After Sorting by Name: ");
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);

    }

    public static void sortByGpa(List<Student> studentList) {
        System.out.println("After Sorting by Gpa: ");
        Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);

    }

    public static void comparatorChaining(List<Student> studentList) {
        System.out.println("After Sorting by comparatorChaining: ");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);

    }

    public static void sortWithNull(List<Student> studentList) {
        System.out.println("After Sort with Null Values: ");
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before Sorting: ");
        studentList.forEach(studentConsumer);
        sortByName(studentList);
        sortByGpa(studentList);
        comparatorChaining(studentList);
        sortWithNull(studentList);
    }
}
