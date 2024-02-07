package tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserSave {
    public static void main(String[] args) throws IOException {
        UserService service = new UserService();

        User user = service.createUser();

        String fileName = "basic_programming/lesson_36/code/lessoncode/resources/UserData_" + user.getId() + ".txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName)); // new FileWriter(fileName,true) - для добавления к существующему файлу, иначе - перезапись файла

        writer.write("ID: " + user.getId() + "\n");
        writer.write("Name: " + user.getName() + "\n");
        writer.write("Description: " + user.getDescription() + "\n");

        writer.flush();
        writer.close();

        System.out.println("Информация о пользователе успешно сохранена в " + fileName);
    }
}
