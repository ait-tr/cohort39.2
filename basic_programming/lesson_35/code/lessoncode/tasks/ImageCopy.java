package tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
    public static void main(String[] args) throws IOException {
        String sourcePath = "basic_programming/lesson_36/code/lessoncode/resources/30.jpeg"; // Укажите путь к исходному файлу
        String destinationPath = "basic_programming/lesson_36/code/lessoncode/resources/30_new.jpeg"; // Укажите путь куда копировать

        FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destinationPath);

            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }

            System.out.println("Файл успешно скопирован.");


    }
}
