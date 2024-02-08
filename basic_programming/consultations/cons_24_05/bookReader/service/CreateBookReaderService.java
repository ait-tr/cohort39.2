package bookReader.service;

import bookReader.entity.Book;
import bookReader.repository.BookRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CreateBookReaderService {

    BookRepository repository = new BookRepository();

    public void processBooks(String filePath, List<Book> books) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains("{") && line.contains("}")) {
                    // Однострочный формат
                    Book newBook = parseSingleLineBook(line);
                    repository.addBook(books,newBook);

                } else if (line.contains("{")) {
                    // Многострочный формат, считываем и обрабатываем как ранее
                    Book newBook = parseMultiLineBook(reader,line);
                    repository.addBook(books,newBook);
                }
            }
        }
    }

    private Book parseSingleLineBook(String bookData) {
        // Удаление фигурных скобок из строки
        bookData = bookData.replace("{", "").replace("}", "").trim();

        // Разделение строки на части по запятым
        String[] parts = bookData.split(",\\s*");
        // Предполагаем, что порядок частей всегда одинаков: Название, Автор, Год издания

        String title = parts[0].split(":")[1].trim().replace("\"", "");
        String author = parts[1].split(":")[1].trim().replace("\"", "");
        int year = Integer.parseInt(parts[2].split(":")[1].trim());

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

}