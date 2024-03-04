import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
        public static void main(String[] args) {
            List<String> emails = new ArrayList();
            emails.add("name@gmail.com");
            emails.add("@gmail.com");

            String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
            Pattern pattern = Pattern.compile(regex);

            for(String email : emails){
                Matcher matcher = pattern.matcher(email);
                System.out.println(email + " : " + matcher.matches());
            }

        }

}
