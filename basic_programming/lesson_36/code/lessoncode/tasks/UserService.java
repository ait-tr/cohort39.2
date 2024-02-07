package tasks;

import lotto.service.UserInput;

import java.util.Scanner;

public class UserService {

      User createUser (){

        UserInput userInput = new UserInput();

        int id = userInput.uiInt("Введите ID:");
        String name = userInput.uiText("Введите имя:");
        String description = userInput.uiText("Введите описание:");

        return new User(id, name, description);
    }
}
