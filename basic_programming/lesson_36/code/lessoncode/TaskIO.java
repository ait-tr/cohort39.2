import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TaskIO {
    /*
самостоятельная

1. Создайте файл, используя FileOutputStream, с текстом: "This is my first experience when I myself work with IO API.
I can do everything!"
2. Создайте файл используя new File() в каталоге Desktop, убедитесь, что файл существует, удалите файл.
3. Создайте метод для удаления директории и суб-директорий
 */

    public static void main(String[] args) throws IOException {
        File testFile = new File("basic_programming/lesson_36/code/lessoncode/resources/testFileLastExample.txt");

        FileOutputStream stream = new FileOutputStream(testFile);

        stream.write("This is my first experience when I myself work with IO API. I can do everything! (Line 1) ".getBytes());
        stream.write("\n".getBytes());
        stream.write("This is my first experience when I myself work with IO API. I can do everything! (Line 2) ".getBytes());
        stream.close();

        boolean isExist = testFile.exists();
        System.out.println("Is our file exist? " + isExist);

//        boolean successDelete = testFile.delete();

  //      System.out.println("is delete? " + successDelete);

        File parentDir = new File("basic_programming/lesson_36/code/lessoncode/resources/testTwo");


        removeDirAndSubDir(parentDir);

    }

    public static boolean removeDirAndSubDir(File dir){
        // testTwo
        // - testThree
        // - testFour

        File[] allContents = dir.listFiles();

        if (allContents != null) {
            for (File file : allContents) {
                removeDirAndSubDir(file);
            }
        }
        return dir.delete();
    }
}
