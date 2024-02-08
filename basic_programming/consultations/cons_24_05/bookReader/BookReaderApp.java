package bookReader;

import bookReader.entity.Book;
import bookReader.repository.BookRepository;
import bookReader.service.BookPrintService;
import bookReader.service.CreateBookReaderService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookReaderApp {
    public static void main(String[] args) throws IOException {

        CreateBookReaderService createService = new CreateBookReaderService();
        BookRepository repository = new BookRepository();
        BookPrintService printService = new BookPrintService();

        String filePath = "basic_programming/consultations/cons_24_05/bookReader/books.txt"; // Укажите актуальный путь к файлу
        List<Book> books = new ArrayList<>();

        createService.processBooks(filePath, books);

        for (Book book : books){
            System.out.println(book);
        }

        String searchTitle = "Преступление и наказание";

        Optional<Book> foundBook = repository.findBook(books, searchTitle);

        printService.printFindResult(foundBook, searchTitle);
    }


}