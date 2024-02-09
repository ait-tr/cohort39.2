package examples;

import lotto.service.UserInput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("test2.txt");
        BufferedReader fileInput = new BufferedReader(fileReader);

        while (fileInput.ready()) {}

    }
}
