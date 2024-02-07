package filesIO;

import java.io.*;

public class Example6 {
    public static void main(String[] args) throws IOException {

        String data = "This is file output stream";

        FileOutputStream fileOutputStream = new FileOutputStream("outputStream.txt");

        byte[] outputArray = data.getBytes();

        fileOutputStream.write(outputArray);

        fileOutputStream.close();

        OutputStream outputStream = new FileOutputStream("text.txt");
        InputStream inputStream = new FileInputStream("text.txt");

        outputStream.write('А');
        outputStream.write('Б');
        outputStream.write('В');

        System.out.println("" + (char) inputStream.read());
        System.out.println("" + (char) inputStream.read());
        System.out.println("" + (char) inputStream.read());



    }
}
