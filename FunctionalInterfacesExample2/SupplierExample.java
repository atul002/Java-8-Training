package FunctionalInterfacesExample2;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Student> studentSupplier = () -> {
            return new Student("Atul", 3, 3.6, "male", Arrays.asList("Cricket", "Reading", "Origami"));
        };
        System.out.println("Student is: "+studentSupplier.get());

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
        System.out.println("Student List: "+listSupplier.get());

    }
}
