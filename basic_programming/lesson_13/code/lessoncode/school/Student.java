package school;

public class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "studetnAndBook.Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
