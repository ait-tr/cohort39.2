package sortArrayListExample;

public class Student  {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "studetnAndBook.Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

}
