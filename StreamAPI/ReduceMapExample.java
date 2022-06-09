package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class ReduceMapExample {

    public static int totalNotebooks() {
        int notebooks = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNotebooks)
                .reduce(0, (a,b)-> a+b);

        return notebooks;
    }
    public static void main(String[] args) {

        System.out.println("Total Notebooks: "+totalNotebooks());
    }
}
