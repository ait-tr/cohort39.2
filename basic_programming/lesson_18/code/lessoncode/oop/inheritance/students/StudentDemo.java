package oop.inheritance.students;

class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student();
        student.learn();
        System.out.println("==== JUNIOR");
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.code();
        juniorDeveloper.learn();
        System.out.println(" =====  MIDDLE");
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        middleDeveloper.code();
        middleDeveloper.learn();
        middleDeveloper.debug();
        System.out.println("==== SENIOR");
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        seniorDeveloper.code();
        seniorDeveloper.learn();
        seniorDeveloper.debug();
        seniorDeveloper.mentoring();
        seniorDeveloper.solveProblem();

        Student[] students = {
                student,
                juniorDeveloper,
                middleDeveloper,
                seniorDeveloper
        };

        JuniorDeveloper[] juniorDevelopers = {
                juniorDeveloper,
                middleDeveloper,
                seniorDeveloper
        };

        MiddleDeveloper[] middleDevelopers = {
                middleDeveloper,
                seniorDeveloper
        };

        SeniorDeveloper[] seniorDevelopers = {
                seniorDeveloper
        };

    }
}
