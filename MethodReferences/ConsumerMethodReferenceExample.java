package MethodReferences;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    static Consumer<Student> c1 = p-> System.out.println(p);

    static Consumer<Student> c2 = System.out::println;
    static Consumer<Student> c3 = Student::printListActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c2);
        StudentDataBase.getAllStudents().forEach(c3);
    }
}
