package bookReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class BookFindService {


    Optional<Book> findBook(List<Book> books, String searchTitle) {
        Book foundBook = books.stream()
                .filter(book -> book.getBookName().equalsIgnoreCase(searchTitle))
                .findFirst()
                .orElse(null);
        return Optional.ofNullable(foundBook);
    }

    void printFindResult(Optional<Book> foundBook, String searchTitle) {
        if (foundBook.isPresent()) {
            System.out.println("Найденная книга: " + foundBook.get());
        } else {
            System.out.println("Книга с названием \"" + searchTitle + "\" не найдена.");
        }
    }
}
