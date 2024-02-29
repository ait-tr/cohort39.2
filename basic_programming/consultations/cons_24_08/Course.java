import java.util.ArrayList;
import java.util.List;

public class Course {
    String name;
    List<Question> questions;
    int totalQuestions;

    public Course(String name) {
        this.name = name;
        this.questions = new ArrayList<>();
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }
}
