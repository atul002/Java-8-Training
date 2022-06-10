package Optionals;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample1 {
    public static String getStudentName() {
        Student student = StudentDataBase.studentSupplier.get();

        if(student!=null) {
            return student.getName();
        }

        return null;
    }

    public static Optional<String> getStudentNameOptional() {
//        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);

        if(studentOptional.isPresent()) {
            return studentOptional.map(Student::getName);
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
//        String name = getStudentName();
//        System.out.println("Length of Student Name: "+name.length());

        Optional<String> stringOptional = getStudentNameOptional();
        if(stringOptional.isPresent()) {
            System.out.println("Length of Student Name: "+stringOptional.get().length());
        }
        else {
            System.out.println("Name not available!");
        }
    }
}
