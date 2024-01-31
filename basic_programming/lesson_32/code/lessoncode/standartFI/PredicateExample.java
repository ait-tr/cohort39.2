package standartFI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        List<UserRole> users = new ArrayList<>();

        users.add(new UserRole("Aleks", "admin"));
        users.add(new UserRole("Thea", "member"));
        users.add(new UserRole("Aleks2", "admin"));
        users.add(new UserRole("Aleks3", "admin"));
        users.add(new UserRole("Aleks4", "admin"));
        users.add(new UserRole("Aleks5", "member"));

        List<UserRole> admin = process(users, (UserRole user) -> user.getRole().equals("admin"));

        System.out.println(admin);

        List<UserRole> members = process(users, (UserRole user) -> user.getRole().equals("member"));

        System.out.println(members);




    }

    public static List<UserRole> process(List<UserRole> users, Predicate<UserRole> predicate){

        List<UserRole> result = new ArrayList<>();

        for (UserRole user : users){
            if (predicate.test(user)) {
            result.add(user);
            }
        }
        return result;
    }
}
