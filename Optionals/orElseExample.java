package Optionals;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class orElseExample {
    /**
     * orElse
     * orElseGet
     * orElseThrow
     * */

    public static String optionalOrElse() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        //Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }
    public static String optionalOrElseGet() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

//        Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElseGet(()->"Default");
        return name;
    }

    public static String optionalOrElseThrow() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

//        Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElseThrow(()->new RuntimeException("no data available!"));
        return name;
    }

    public static void main(String[] args) {
        System.out.println("orElse: "+optionalOrElse());
        System.out.println("orElseGet: "+optionalOrElseGet());
        System.out.println("orElseThrow: "+optionalOrElseThrow());
    }
}
