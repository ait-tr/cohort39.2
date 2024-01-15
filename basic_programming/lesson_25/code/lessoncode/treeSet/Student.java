package treeSet;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
      int compareResult = roll - o.roll;
      if (compareResult == 0) {
          compareResult = name.compareTo(o.name);
      }
      return compareResult;
    }
}
