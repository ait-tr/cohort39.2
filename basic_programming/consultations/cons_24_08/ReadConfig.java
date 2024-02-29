import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadConfig {
    public static void main(String[] args) {
        String configFileName = "config.txt";
        Map<String,String> fileMapping = new HashMap<>();
        int numberOfCourses = 0;

        try{
            BufferedReader reader = new BufferedReader(new FileReader(configFileName));

            // считываем данные о количестве курсов
            String readLine;
            boolean dataFilesSection = false;

            while ((readLine = reader.readLine()) != null) {
                if (readLine.startsWith("Number of courses :")) {
                    numberOfCourses = Integer.parseInt(readLine.split(":")[1].trim());
                    continue;
                }
                if (readLine.startsWith("Datafiles")){
                    dataFilesSection = true;
                }
                if (dataFilesSection) {
                    String[] parts = readLine.split(":");
                    fileMapping.put(parts[0].trim(), parts[1].trim());
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (fileMapping.size() != numberOfCourses) {
            System.out.println("Ошибка! Количество заявленных не совпадает с загруженными данными!");
            System.exit(1);
        }

        List<Course> courses = new ArrayList<>();

        for (String fileKey : fileMapping.keySet()){
            String filename = fileMapping.get(fileKey);
            Course course = new Course(filename);
            parseCourseData(filename, course);
            courses.add(course);
        }
        
        for (Course course : courses){
            System.out.println("Курс: ");
            for (Question question : course.questions){
                System.out.println("Вопрос: " + question.question);
                System.out.println("Список ответ: " + question.answers);
                System.out.println("Корректный ответ: " + question.correctAnswer);
            }
        }
    }

    private static void parseCourseData(String filename, Course course){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String readLine;
            Question currentQuestion = null;
            boolean blockOfQuestions = false;

            while ((readLine = reader.readLine()) != null){
                if (readLine.startsWith("Number of questions")){
                    course.totalQuestions = Integer.parseInt(readLine.split(":")[1].trim());
                    continue;
                }
                
                if (readLine.startsWith("Question #")){
                    int indexStartQuestion = readLine.indexOf(":");
                    String textQuestion = readLine.substring(indexStartQuestion).trim();
                    currentQuestion = new Question(textQuestion);
                    course.questions.add(currentQuestion);
                } else if (readLine.startsWith("Ответ")) {
                    int indexStartAnswer = readLine.indexOf(":");
                    String textAnswer = readLine.substring(indexStartAnswer).trim();
                    currentQuestion.answers.add(textAnswer);
                } else if (readLine.startsWith("Правильный ответ")) {
                    currentQuestion.correctAnswer = Integer.parseInt(readLine.split(":")[1].trim());
                }
            }
            reader.close();

            if (course.questions.size() != course.totalQuestions) {
                System.out.println("ОШИБКА ЧТЕНИЯ ФАЙЛА!");
                System.out.println("Количество заявленных вопросов не совпадает с загруженными данными!");
                System.exit(1);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
