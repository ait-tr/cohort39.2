package examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example2WithTryCath {
    public static void main(String[] args)  {

        try {
            FileReader fileReader = new FileReader("test2.txt");
            BufferedReader fileInput = new BufferedReader(fileReader);


        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        }

        System.out.println("Продолжение работы программы");

    }
}
