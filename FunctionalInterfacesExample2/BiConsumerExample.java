package FunctionalInterfacesExample2;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void NameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();

        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
            System.out.println(name+" : "+activities);
        };

        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }
    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a,b) -> {
            System.out.println("a:"+a+" b:"+b);
        };

        biConsumer.accept("Java", "Java8");

        BiConsumer<Integer, Integer> multiply = (a, b) ->{
            System.out.println("Product is: " +(a*b));
        };

        BiConsumer<Integer, Integer> divison = (a, b) ->{
            System.out.println("Result is: " +(a/b));
        };

        multiply.andThen(divison).accept(10,5);
        NameAndActivities();
    }
}
