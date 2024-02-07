package filesIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) throws IOException {

        String data = "This is file output stream";

        FileOutputStream fileOutputStream = new FileOutputStream("outputStream.txt");

        byte[] outputArray = data.getBytes();

        fileOutputStream.write(outputArray);

    }
}
