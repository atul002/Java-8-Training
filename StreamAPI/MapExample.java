package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {
    public static List<String> nameList() {
        List<String> nameList = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList()); //Collects List of Strings

        return nameList;
    }

    public static Set<String> nameSet() {
        Set<String> nameList = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet()); //collects Set of Strings

        return nameList;
    }
    public static void main(String[] args) {
        System.out.println("List of Names: "+nameList());
        System.out.println("Set of Names: "+nameSet());
    }
}
