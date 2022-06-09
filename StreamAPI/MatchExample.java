package StreamAPI;

import data.StudentDataBase;

public class MatchExample {

    public static boolean allMatch() {
       return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3.5);
    }

    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=3.9);
    }

    public static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=3.5);
    }
    public static void main(String[] args) {
        System.out.println("allMatch Result: "+allMatch());
        System.out.println("anyMatch Result: "+anyMatch());
        System.out.println("noneMatch Result: "+noneMatch());

    }
}
