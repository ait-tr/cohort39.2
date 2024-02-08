package bookReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class BookReaderService {

    void createBook(BufferedReader reader, List<Book> books) throws IOException {

        String title = extractValue(reader.readLine());
        String author = extractValue(reader.readLine());
        int yearOfPublication = Integer.parseInt(extractValue(reader.readLine()).replaceAll("[^\\d]", ""));

        books.add(new Book(title, author, yearOfPublication));
    }

    private String extractValue(String line) {
        String value = line.substring(line.indexOf(":") + 1);
        value = value.contains(",") ? value.substring(0, value.indexOf(",")) : value;
        value = value.contains("}") ? value.replace("}", "") : value;
        return value.replace("\"", "").trim();
    }

    Optional<Book> findBook(List<Book> books, String searchTitle) {
        Book foundBook = books.stream()
                .filter(book -> book.getBookName().equalsIgnoreCase(searchTitle))
                .findFirst()
                .orElse(null);
        return Optional.ofNullable(foundBook);
    }

    void printFindResult(Optional<Book> foundBook, String searchTitle) {
        if (foundBook.isPresent()) {
            System.out.println("Найденная книга: " + foundBook);
        } else {
            System.out.println("Книга с названием \"" + searchTitle + "\" не найдена.");
        }
    }
}
