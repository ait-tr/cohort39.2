package students;

public class Student {
    private int id;
    private Person person;
    private String group;
    private double averageMark;
    private boolean isStudent;

    public Student(int id, Person person, String group, double averageMark, boolean isStudent) {
        this.id = id;
        this.person = person;
        this.group = group;
        this.averageMark = averageMark;
        this.isStudent = isStudent;
    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public boolean isStudent() {
        return isStudent;
    }

    @Override
    public String toString() {
        return "studetnAndBook.Student{" +
                "id=" + id +
                ", person=" + person +
                ", group='" + group + '\'' +
                ", averageMark=" + averageMark +
                ", isStudent=" + isStudent +
                '}';
    }
}
