package task;

import java.util.*;

public class GradeManagementSystem {
    private List<Student> students = new ArrayList<>();
    private TreeSet<String> subjects = new TreeSet<>();
    private Map<Integer, Map<String, List<Integer>>> grades = new HashMap<>();

    public void addStudent(Student student) {
        students.add(student);
        grades.put(student.getId(), new HashMap<>());
    }

    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getId() == studentId);
        grades.remove(studentId);
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    public void addGrade(int studentId, String subject, int grade) {
        if (!subjects.contains(subject)) {
            System.out.println("Subject does not exist.");
            return;
        }

        Map<String, List<Integer>> studentGrades = grades.get(studentId);
        if (studentGrades == null) {
            System.out.println("Student does not exist.");
            return;
        }

        studentGrades.computeIfAbsent(subject, k -> new ArrayList<>()).add(grade);
    }

    public double getAverageGrade(int studentId, String subject) {
        Map<String, List<Integer>> studentGrades = grades.get(studentId);
        if (studentGrades == null || !studentGrades.containsKey(subject)) {
            System.out.println("No grades available for this student and subject.");
            return 0.0;
        }

        List<Integer> subjectGrades = studentGrades.get(subject);
        return subjectGrades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public String getTopStudent() {
        double maxAverage = 0.0;
        String topStudent = "None";
        for (Student student : students) {
            double average = grades.get(student.getId()).values().stream()
                    .flatMapToInt(l -> l.stream().mapToInt(Integer::intValue))
                    .average().orElse(0.0);
            if (average > maxAverage) {
                maxAverage = average;
                topStudent = student.getFullName();
            }
        }
        return topStudent;
    }
}


