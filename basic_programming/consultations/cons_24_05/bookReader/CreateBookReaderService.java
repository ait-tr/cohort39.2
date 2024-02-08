package bookReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class CreateBookReaderService {

    public void processBooks(String filePath, List<Book> books) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains("{") && line.contains("}")) {
                    // Однострочный формат
                    Book newBook = parseSingleLineBook(line);
                    addBook(books,newBook);

                } else if (line.contains("{")) {
                    // Многострочный формат, считываем и обрабатываем как ранее
                    Book newBook = parseMultiLineBook(reader,line);
                    addBook(books,newBook);
                }
            }
        }
    }

    private Book parseSingleLineBook(String bookData) {

            int titleStart = bookData.indexOf("\"") + 1;
            int titleEnd = bookData.indexOf("\"", titleStart);
            String title = bookData.substring(titleStart, titleEnd);

            int authorStart = bookData.indexOf("\"", titleEnd + 1) + 1;
            int authorEnd = bookData.indexOf("\"", authorStart);
            String author = bookData.substring(authorStart, authorEnd);

            int yearStart = bookData.lastIndexOf(":") + 1;
            int yearEnd = bookData.indexOf("}", yearStart);
            int year = Integer.parseInt(bookData.substring(yearStart, yearEnd).trim());

            return new Book(title, author, year);

    }

    Book parseMultiLineBook(BufferedReader reader, String line) throws IOException {

        String title = extractValue(line);
        String author = extractValue(reader.readLine());
        int yearOfPublication = Integer.parseInt(extractValue(reader.readLine()).replaceAll("[^\\d]", ""));

        return new Book(title, author, yearOfPublication);
    }

    private String extractValue(String line) {
        String value = line.substring(line.indexOf(":") + 1);
        value = value.contains(",") ? value.substring(0, value.indexOf(",")) : value;
        value = value.contains("}") ? value.replace("}", "") : value;
        return value.replace("\"", "").trim();
    }

    void addBook(List<Book> books, Book book) {
        if (book.getBookName() == null || book.getBookName().isBlank()) {
            System.out.println("Книга не добавлена: отсутствует название.");
            return;
        }
        if (book.getAuthor() == null || book.getAuthor().isBlank()) {
            System.out.println("Книга не добавлена: отсутствует автор.");
            return;
        }
        if (book.getYear() <= 1800) {
            System.out.println("Книга не добавлена: неверный год издания.");
            return;
        }
        books.add(book);
        System.out.println("Книга успешно добавлена: " + book);

    }
}