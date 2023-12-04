package school;

import java.util.Arrays;

public class SchoolApp {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        System.out.println(students);
        System.out.println(Arrays.toString(students));

        students[0] = new Student("Elena", 1);
        students[1] = new Student("Valeria", 1);
        students[2] = new Student("Otalbec", 3);

        System.out.println(Arrays.toString(students));

        students[0].course = 2;

        System.out.println(Arrays.toString(students));

        students[1].course = 2;

        System.out.println(Arrays.toString(students));

        students[2] .course = 0;

        System.out.println(Arrays.toString(students));



    }
}
