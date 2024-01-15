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
    public int compareTo(Student newStudent) {
      int compareResult = roll - newStudent.roll;
      if (compareResult == 0) {
          compareResult = name.compareTo(newStudent.name);
      }
      return compareResult;
    }
}
