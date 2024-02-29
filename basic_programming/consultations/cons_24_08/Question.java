import java.util.ArrayList;
import java.util.List;

public class Question {
    String question;
    List<String> answers;
    int correctAnswer;

    public Question(String question) {
        this.question = question;
        this.answers = new ArrayList<>();
    }


}
