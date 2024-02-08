package bookReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookReader {
    public static void main(String[] args) throws IOException {

        CreateBookReaderService createService = new CreateBookReaderService();
        BookFindService findService = new BookFindService();

        String filePath = "basic_programming/consultations/cons_24_05/bookReader/books.txt"; // Укажите актуальный путь к файлу
        List<Book> books = new ArrayList<>();

        createService.processBooks(filePath, books);

        for (Book book : books){
            System.out.println(book);
        }

        String searchTitle = "Преступление и наказание";

        Optional<Book> foundBook = findService.findBook(books, searchTitle);

        findService.printFindResult(foundBook, searchTitle);
    }


}