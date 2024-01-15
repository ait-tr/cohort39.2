package treeSet;

import java.util.Set;
import java.util.TreeSet;

public class StudentsDemo {
    public static void main(String[] args) {

        Set<Student> students = new TreeSet<>();

        students.add(new Student(45, "Raul"));
        students.add(new Student(11, "Pablo"));
        students.add(new Student(27, "Alex"));
        students.add(new Student(27, "Max"));

        System.out.println(students);


    }
}
