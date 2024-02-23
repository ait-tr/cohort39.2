package task;

import java.util.*;

public class StudentGradeBook {

    private List<Student> students = new ArrayList<>();
    private TreeSet<String> subjects = new TreeSet<>();
    private Map<Integer, Map<String, List<Integer>>> grades = new HashMap<>();

    public void addStudent(Student student){
        students.add(student);
        grades.put(student.getId(), new HashMap<>());
    }

    public void removeStudent(Integer studentId){
        students.removeIf(student -> student.getId() == studentId);
        grades.remove(studentId);
    }

    public void addSubject(String subject){
        subjects.add(subject);
    }

    public void addGrade(int studentId, String subject, int grade){
        if (!subjects.contains(subject)) {
            System.out.println("Предмета " + subject + " нет в списке предметов для оценок");
            return;
        }

//        grades.get(studentId).
//                computeIfAbsent(subject, k -> new ArrayList<>())
//                .add(grade);

        Map<String,List<Integer>> mapSubjectGrades = grades.get(studentId);

        if (mapSubjectGrades.get(subject) == null) {
            List<Integer> gradesForCurrentSubject = new ArrayList<>();
            mapSubjectGrades.put(subject, gradesForCurrentSubject);
        }

        List<Integer> gradesForCurrentSubject = mapSubjectGrades.get(subject);

        gradesForCurrentSubject.add(grade);

    }

    public double getAverageGrade(int studentId, String subject){
        List<Integer> studentGrades = grades.get(studentId).get(subject);

        if (studentGrades == null || studentGrades.isEmpty()) {
            return 0.0;
        }

        return studentGrades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public Student getTopStudent(){
        double highestAvgGrade = 0;
        Student topStudent = null;

        for (Student student : students) {
            double totalGrade = 0;
            int countGrades = 0;

            Map<String, List<Integer>> studentGrades = grades.get(student.getId());
            for (List<Integer> gradeList : studentGrades.values()) {
                for (int grade : gradeList) {
                    totalGrade += grade;
                    countGrades++;
                }
            }

            double averageGrade = totalGrade / countGrades;

            if (averageGrade > highestAvgGrade) {
                highestAvgGrade = averageGrade;
                topStudent = student;
            }
        }
         return topStudent;
        }
    }
