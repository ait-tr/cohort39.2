package bookReader.repository;

import bookReader.entity.Book;
import bookReader.service.BookValidator;

import java.util.List;
import java.util.Optional;

public class BookRepository {

    BookValidator validator = new BookValidator();

    public void addBook(List<Book> books, Book book) {
        if (validator.isValid(book)) {
            books.add(book);
            System.out.println("Книга успешно добавлена: " + book);
        }
    }

    public Optional<Book> findBook(List<Book> books, String searchTitle) {
        Book foundBook = books.stream()
                .filter(book -> book.getBookName().equalsIgnoreCase(searchTitle))
                .findFirst()
                .orElse(null);
        return Optional.ofNullable(foundBook);
    }
}
