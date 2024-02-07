package SymbolsWriteAndRead;

import java.io.*;

public class WriteAndReadText {
    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("writeExample.txt"));

        writer.newLine();
        writer.write("Hello, World!");
        writer.newLine();
        writer.newLine();
        writer.write("This is our example working with BufferWriter!");
        writer.newLine();
        writer.newLine();
        writer.flush();

        writer.close();




        FileReader fileReader = new FileReader("test_stream.txt");
        int character;

//        while ((character = fileReader.read()) != -1){
//            System.out.print((char) character + " ");
//        }
//
//        fileReader.close();
//
//        fileReader = new FileReader("test_stream.txt");
//

//        System.out.println();
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line = "";
//        int counter = 0;
//
//        while ((line = bufferedReader.readLine()) != null) {
//            counter++;
//            System.out.println("Line # " + counter + " : " + line);
//        }

    }
}
