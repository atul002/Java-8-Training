package FunctionalInterfacesExample2;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    public static void filterStudentByGradeLevel() {
        System.out.println("Filter by Grade Level:");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p1.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentByGpa() {
        System.out.println("Filter by GPA Level:");

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p2.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudents() {
        System.out.println("Filter Students:");

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p1.or(p2).negate().test(student)) {
                System.out.println(student);
            }
        }));
    }
    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudents();
    }
}
