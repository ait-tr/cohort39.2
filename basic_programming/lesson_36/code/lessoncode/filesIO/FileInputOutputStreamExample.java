package filesIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamExample {
    public static void main(String[] args) throws IOException {
        outputExample("test_stream.txt");
        inputExample("test_stream.txt");
    }

    public static void inputExample(String path) throws IOException {

        FileInputStream input = new FileInputStream(path);

        int data = input.read();

        while (data != -1) {
            System.out.println((char) data + " ");
            data = input.read();
        }
        input.close();

    }


    public static void outputExample(String path) throws IOException {
        FileOutputStream output = new FileOutputStream(path);
        output.write("Привет как дела?".getBytes());
        output.close();
    }

}
