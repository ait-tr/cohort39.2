package sortArrayListExample;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Student> ts = new ArrayList<>();
        ts.add(new Student(45, "Raul"));
        ts.add(new Student(11, "Pablo"));
        ts.add(new Student(27, "Alex"));
        ts.add(new Student(27, "Max"));

        System.out.println(ts);

        Collections.sort(ts,new MyComparator());

        System.out.println(ts);
    }
}
