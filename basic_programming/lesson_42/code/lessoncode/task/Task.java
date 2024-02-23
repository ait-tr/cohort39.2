package task;

public class Task {
    public static void main(String[] args) {
        GradeManagementSystem system = new GradeManagementSystem();

        // Пример использования
        Student student1 = new Student(1, "Olga", "Olga");
        Student student2 = new Student(2, "Ruslan", "Ruslan");

        system.addStudent(student1);
        system.addStudent(student2);

        system.addSubject("Математика");
        system.addSubject("История");

        system.addGrade(1, "Математика", 10);
        system.addGrade(1, "История", 8);
        system.addGrade(2, "Математика", 12);

        System.out.println("Average grade for Olga in Mathematics: " + system.getAverageGrade(1, "Математика"));
        System.out.println("Top student: " + system.getTopStudent());
    }
}
