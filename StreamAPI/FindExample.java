package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class FindExample {

    public static Optional<Student> findAny() {
       return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirst() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=4.1)
                .findFirst();
    }
    public static void main(String[] args) {
        Optional<Student> studentFindAny = findAny();
        if (studentFindAny.isPresent()){
            System.out.println("Student findAny: "+studentFindAny.get());
        }
        else {
            System.out.println("Student not Found!");
        }

        Optional<Student> studentFindFirst = findFirst();
        if (studentFindFirst.isPresent()){
            System.out.println("Student findFirst: "+studentFindFirst.get());
        }
        else {
            System.out.println("Student not Found!");
        }


    }
}
